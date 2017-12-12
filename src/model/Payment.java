package model;

import java.sql.SQLException;
import java.util.ArrayList;

public class Payment extends Api {
	
	public void CreateOrder(int userID,double price, Order ordr) {
		price = price * 1.05;
		rs = GetResultSet("Insert into Orders(userID,date,orderTotal) values('" + userID + "',GETDATE()," + price + ")");
		//we need to get orders id that was placed into the db and pass to 
		rs = GetResultSet("select max(orderID) from orders");
		int value = -1;
		try {
			if(rs != null) 
			{
				while(rs.next())
				{					
					value = rs.getInt(0);	
					System.out.println(value);
				}//while
			}else {} 
		}catch(SQLException s) {s.printStackTrace();}
		InsertFoodIngQtyInDB(ordr,value);
	}
	private void InsertFoodIngQtyInDB(Order o, int orderID) {
		System.out.println("Trying to get the FIQ list");
		ArrayList<FoodIngQty> fullListFIQ = GetMyFIQList(); //the database returns the full table of FIQ
		ArrayList<OrderIntoDB> orderPutIntoDB = new ArrayList<OrderIntoDB>();
		int counter = 0;
		//Go into order and get all menu items
		for(MenuItem mi : o.getOrderItems())
		{
			counter++;
			for(Ingredient ig : mi.getItemIngred())
			{
				for(FoodIngQty qt : fullListFIQ)
				{
					if(mi.getmIndex() == qt.getFoodID() && ig.getIng_id() == qt.getIngID())
					{
						int fiqID = qt.getFoodIngID(); //this gets what FIQ table has for the food and ing combination. Need to create the Order, FIQ, LineItem in SQL
						OrderIntoDB db = new OrderIntoDB(orderID,fiqID,counter);
						orderPutIntoDB.add(db);
						break;
					}//if
				}//for qt
			}//for ing
		}//for mi
		SendToDatabase(orderPutIntoDB);
	}//insertFoodIngQtyInDB
	
	private void SendToDatabase(ArrayList<OrderIntoDB> dbStuff){
		for(OrderIntoDB oDB : dbStuff)
		{
			rs = GetResultSet("Insert into Order_Food(OrderId, FIQ_id, LineItem) values("+oDB.getOrderID()+","+oDB.getFiqID()+","+oDB.getLineOrderNum()+")");
		}//for
	}//SendToDatbase
	
	private ArrayList<FoodIngQty> GetMyFIQList() {
		ArrayList<FoodIngQty> myFullList = new ArrayList<FoodIngQty>();
		rs = GetResultSet("Select * from Food_Ing_Qty");
		int fiqID;
		int fID;
		int iID;
		try {
			if(rs != null) 
			{
				while(rs.next())
				{
					System.out.println("Trying to gather all the FIQ table");
					fiqID = rs.getInt("FIQ_id");
					fID = rs.getInt("Food_id");
					iID = rs.getInt("Ing_id");					
					FoodIngQty fiq = new FoodIngQty(fiqID, fID, iID);
					myFullList.add(fiq);
				}//while
			}else {myFullList = null;} //it returned no results
		}catch(SQLException s) {s.printStackTrace();}		
		return myFullList;
	}//getMyFIQList
}//Payment
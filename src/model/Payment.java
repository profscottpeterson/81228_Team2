package model;

import java.sql.SQLException;
import java.util.ArrayList;

public class Payment extends Api {
	public void createOrder(int userID,double price) {
		price = price * 1.05;
		rs = GetResultSet("insert into Orders(userID,date,orderTotal) values ('" + userID + "',GETDATE()," + price + ")");
	}
	public void insertFoodIngQtyInDB(Order o) {
		System.out.println("Trying to get the FIQ list");
		ArrayList<FoodIngQty> fullListFIQ = GetMyFIQList(); //the database returns the full table of FIQ
		//need to build a way for the order to look through the fullListFIQ and determine which ones it needs to insert for the order
		for (MenuItem m : o.getOrderItems()) {
			rs = GetResultSet("insert into Order_Food(foodID,price ) Values (" + m.getItemIngred() + "," + m.getPrice() + ")");
			double price = 0;
			price = price + m.getPrice();
			
			//createOrder(pp.user.Id, price);
		}//for
	}//insertFoodIngQtyInDB
	
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
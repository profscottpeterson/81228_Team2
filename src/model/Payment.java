package model;

public class Payment extends Api {
	public void createOrder(int userID,double price) {
		price = price * 1.05;
		rs = GetResultSet("insert into Orders(userID,date,orderTotal) values ('" + userID + "',GETDATE()," + price + ")");
	}
	public void insertOrderInDB(Order o) {
		for (MenuItem m : o.getOrderItems()) {
			rs = GetResultSet("insert into Order_Food(foodID,price ) Values (" + m.getItemIngred() + "," + m.getPrice() + ")");
			double price = 0;
			price = price + m.getPrice();
			
			//createOrder(pp.user.Id, price);
		}
		
	}
	
}

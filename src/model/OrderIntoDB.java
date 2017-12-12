package model;

public class OrderIntoDB {
	private int orderID;
	private int fiqID;
	private int lineOrderNum;
	
	public OrderIntoDB(){}//default
	public OrderIntoDB(int oID, int fqID, int lonID)
	{
		setOrderID(oID);
		setFiqID(fqID);
		setLineOrderNum(lonID);
	}//OrderIntoDB
	
	protected int getOrderID() {
		return orderID;
	}
	protected void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	protected int getFiqID() {
		return fiqID;
	}
	protected void setFiqID(int fiqID) {
		this.fiqID = fiqID;
	}
	protected int getLineOrderNum() {
		return lineOrderNum;
	}
	protected void setLineOrderNum(int lineOrderNum) {
		this.lineOrderNum = lineOrderNum;
	}

}//OrderIntoDB
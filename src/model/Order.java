package model;

import java.util.ArrayList;

public class Order {
	
	private ArrayList<MenuItem> OrderItems = new ArrayList<MenuItem>();
	private double subtotal = 0;
	private double deliveryCharge = 2;
	private double tax = .05;
	
	public ArrayList<MenuItem> getOrderItems()
	{
		return OrderItems;
	}
	
	public void addItem(MenuItem m)
	{
		OrderItems.add(m);
		subtotal =+m.getPrice();
	}
	
	public void removeItem(MenuItem m)
	{
		OrderItems.remove(m);
		subtotal =-m.getPrice();
	}

	public double addGrandTotal(double sub)
	{
		double grand = sub + deliveryCharge + (sub * tax);
		return grand;
	}
	
}
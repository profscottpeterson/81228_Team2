package model;

import java.util.ArrayList;

public class MenuItem {

	private double price;
	private ArrayList<Ingredient> ItemIngred = new ArrayList<Ingredient>();
	private double extra = .6;
	
	public ArrayList<Ingredient> getItemIngred()
	{
		return ItemIngred;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	private void addIngred(Ingredient I)
	{
		ItemIngred.add(I);
		price =+ extra;
	}
	
	private void removeIngred(Ingredient i)
	{
		ItemIngred.remove(i);
		price =- extra;
	}
}
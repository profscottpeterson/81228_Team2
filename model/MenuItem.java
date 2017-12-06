package model;

import java.util.ArrayList;

public class MenuItem {
	private int mIndex;
	private String name;
	private double price;
	private ArrayList<Ingredient> ItemIngred;
	private double extra = .6;
	
	public MenuItem(){
		ItemIngred = new ArrayList<Ingredient>();
	}//MenuItem
	
	public ArrayList<Ingredient> getItemIngred()
	{
		return ItemIngred;
	}
	
	public Ingredient getOrderIngred(String i)
	{
		Ingredient myIng = new Ingredient();
		int index = Integer.parseInt(i);
		for(Ingredient ig: ItemIngred)
		{
			if(ig.getIng_id() == index)
			{
				myIng = ig;
			}//if
		}
		return myIng;
	}//getOrderIngred
	
	public void addIngred(Ingredient I)
	{
		ItemIngred.add(I);
		//price =+ extra;
	}
	
	private void removeIngred(Ingredient i)
	{
		ItemIngred.remove(i);
		setPrice(- extra);
	}
	public String getName(){
		return this.name;
	}
	public void setName(String Name){
		this.name =Name;
	}

	public int getmIndex() {
		return mIndex;
	}

	public void setmIndex(int mIndex) {
		this.mIndex = mIndex;
	}
	
	public double getPrice()
	{
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}
}
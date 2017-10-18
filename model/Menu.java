package model;

import java.util.ArrayList;

public class Menu {
	
	private ArrayList<MenuItem> FullMenu = new ArrayList<MenuItem>();
	
	public ArrayList<MenuItem> getFullMenu()
	{
		return FullMenu;
	}
	
	public void addToMenu(MenuItem m)
	{
		FullMenu.add(m);
	}
	
	public void removeFromMenu(MenuItem m)
	{
		FullMenu.remove(m);
	}
}

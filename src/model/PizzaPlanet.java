package model;

import view.Quinn;

import java.util.List;

import model.*;

public class PizzaPlanet {
	//	Quinn view;
	String name;
	String address;

	Menu menu;
	User user;
	MenuItem m;

	public PizzaPlanet() {

		
		view.PizzaPlanetGui.userMenu(null);

		System.out.println("This is Pizza Planet constructor, reporting for duty.");
	}

	public void handleUserClick(String usernameIn, String passwordIn) {
		//If this is called, check the db for username and password
		String username = "";
		String password = "";

		if (usernameIn == ""  && passwordIn == "")
		{
			callCategoryScreen();
		}

		else {
			String ValidUser = Api.validateUser(username, password);

			if (ValidUser == null) 
			{
				view.PizzaPlanetGui.userMenu("Invalid User");
			}
			else
			{
				user = new User(ValidUser);
				callCategoryScreen();
			}
		}
	}

	/*
	 * API call: Get ALL menuItems
	 * create a list using the catagory from each item
	 * creatin a new Menu from that catagory
	 */
	private void callCategoryScreen() {
		// TODO Auto-generated method stub
		String menu = Api.getAllMenuItems();
		view.PizzaPlanetGui.menuCats(menu, this.user);
		
	}


}

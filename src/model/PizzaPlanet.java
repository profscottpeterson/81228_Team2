package model;

import view.PizzaPlanetGui;
import view.Quinn;
import model.*;

public class PizzaPlanet {
	PizzaPlanetGui view;
	String name;
	String address;

	Menu menu;
	User user = null;

	public PizzaPlanet() {
		view = new PizzaPlanetGui();
		this.displyUserPage();
		
		this.menu = getMenu();
		
		System.out.println("This is Pizza Planet constructor, reporting for duty.");
	}

	private Menu getMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
	 * USER: get
	 * validate the Users username and password
	 * if its valid, return that User
	 * else, return null
	 */
	public User apiValidateUser(String[] creds) {
		
		/*we have a GUEST */
		if (creds == null) {
			this.displayFirstMenu();
		} 
		/*we have a USER */
		else {
			User returnedUser = Api.validateUser(creds);
			
			/* Invalid User or Password*/
			if(returnedUser == null) {
				this.displyUserPage(); //TODO: pass in error
			}
			/* Valid User, go to next page*/
			else {
				setUser(returnedUser);
				this.displayFirstMenu();	
			}
		}
		
		return null;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	/* Call to view - User Page*/
	private void displyUserPage() {
		view.UserPage(this.user, this);
	}
	
	/* Call to view - First Menu Page*/
	private void displayFirstMenu() {
		//Menu cats = Api.GetFoodTypes();
		view.get1stMenuPage(this.getUser(), null, this);
	}



}

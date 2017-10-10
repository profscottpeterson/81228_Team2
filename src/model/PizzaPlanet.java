package model;

import view.Quinn;
import model.*;

public class PizzaPlanet {
	Quinn view;
	String name;
	String address;

	Menu menu;
	User user;

	public PizzaPlanet() {
//		this.view = new Quinn(this);
		this.user = getThisUser();
		this.menu = getMenu();
		
		System.out.println("This is Pizza Planet constructor, reporting for duty.");
	}

	private Menu getMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * USER: getType
	 * @return Guest or Login 
	 */
	private User getThisUser() {
		User user;
		String userSelect = view.getUserType();

		switch (userSelect) {
		case "GUEST":
			user = new User("GUEST");
			break;
		case "LOGIN":
			user = validateUser();
			break;
		default: 
			user = null;
		}
		
		if(user != null) {
			return user;
		}
		else {
			return null;
		}
	}

	/*
	 * USER: get
	 * validate the Users username and password
	 * if its valid, return that User
	 * else, return null
	 */
	private User validateUser() {
		view.userLogin();
		return null;
	}

}

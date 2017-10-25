package model;

import view.PizzaPlanetGui;
import view.Quinn;

import java.util.List;

import model.*;

public class PizzaPlanet {
	PizzaPlanetGui view;
	String name;
	String address;
	ShoppingCart cart;

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
		System.out.println("pp.apiValitateIUser");
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
	
	public ShoppingCart getCart(){
		return this.cart;
	}
	
	public void setCart(ShoppingCart cart){
		this.cart = cart;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	/* Payment Transaction */
	private String paymentTransaction(Payment pay){
		
		return null;
	}
	
	/* Call to view - Account Page*/
	private void displayAccountPage() {
		view.getAccountPage(this.user, this);
	}

	/* Call to view - User Page*/
	private void displyUserPage() {
		view.UserPage(this.user, this);
	}
	
	/* Call to view - First Menu Page*/
	private void displayFirstMenu() {
		Menu cats = null;
		view.get1stMenuPage(this.getUser(), cats, this);
	}
	
	/* Call to view - Second Menu Page*/
	private void displaySecondMenu() {
		List<Menu> Pizza = null;
		view.get2ndMenuPage(this.getUser(), Pizza, this);
	}

	/* Call to view - Menu Items Detail Page*/
	private void displayMenuItemsDetail() {
		MenuItem peperoniPizza = null;
		view.getMenuItemsDetailPage(this.getUser(), peperoniPizza, this);
	}
	
	/* Call to view - Orders Page*/
	private void displayOrders() {
		view.getOrdersPage(this.getUser(), this.getCart(), this);
	}

	/* Call to view - Payment Page*/
	private void displayPayment() {
		view.getPaymentPage(this.getUser(), this.getCart(), this);
	}
	
	/* Call to view - Confirmation Page*/
	private void displayConfirmation() {
		Payment pay = null;
		view.getConfirmationPage(this.getUser(), pay, this);
	}
	

}

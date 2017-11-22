
package model;

//import view.Quinn;
import view.View2;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

//import model.*;

public class PizzaPlanet {
	//PizzaPlanetGui view;
	static View2 view;
	String name;
	String address;
//	ShoppingCart cart;

//	Menu menu;
	User user = null;

	public PizzaPlanet() {
		//view = new PizzaPlanetGui();
		view = new View2(this);
		this.displyUserPage();
		System.out.println("This is Pizza Planet constructor, reporting for duty.");
	}	
	/*
	 * USER: get
	 * validate the Users username and password
	 * if its valid, return that User
	 * else, return null
	 */
	public User apiValidateUser(User user, Boolean isNewSignUp) {
		System.out.println("pp.apiValitateIUser");
		/*we have a GUEST */
		if (user == null && isNewSignUp == false) {
			this.displayFirstMenu();
		} 
    
		/*we have a new SIGNUP*/
		else if(user == null && isNewSignUp == true){
			this.displaySignUpPage();
		}
		/*we have created a USER*/
		else if(user != null && isNewSignUp == true){
			Boolean success = CreateUserDB.CreateUser(user);
			if (success == true){
				this.displayFirstMenu();
			}
			else{
				this.displaySignUpPage();
			}
		}
		/*we have a registered LOGIN */

		else {
//			String u = creds[0];
//			String p = creds[1];
			
			System.out.println("WE HAVE A NEW USER");
			
			User returnedUser = null;
			boolean validUser = Api.IsThisValidUser(user.userName, user.password);
			if(validUser == true)
			{
				returnedUser = Api.CreateUserInformation(user.userName);

				setUser(returnedUser);
				this.displayFirstMenu();
			}
			
			/* Valid User, go to next page*/
			else {
				this.displyUserPage(); //TODO: if null, return error message
			}
		}
		
		return null;
	}
	
	
	public Menu getMenu(String catMenu) 
	{
		
		if (catMenu != null) {
			Menu menu = Api.GetMenu(catMenu);
			displaySecondMenu(menu);
			System.out.println(catMenu);
		}
		
		return null;
	}
	
	/* Call to view - User Page*/
	public static void displyUserPage() 
	{	
		view.showUserPage();
		//View callback = pp.apiValidateUser()
	}
	
	/* Call to view - First Menu Page*/
	private void displayFirstMenu() 
	{
		System.out.println("displaymenuItems is being called");
		HashMap<String,String> foodTypes = Api.GetFoodTypes();
		
		//TODO: if null, return error message
		if(foodTypes != null)
		{
			view.makeFirstMenuPage(foodTypes);
		}//if
	}
	
	/* Call to view - Second Menu Page*/
	private void displaySecondMenu(Menu menu) {
		Menu pizza = null;
		
		view.makeSecondMenuPage(menu);
	}

	/* Call to view - Menu Items Detail Page*/
	private void displayMenuItemsDetail() {
		MenuItem peperoniPizza = null;
		
		//view.getMenuItemsDetailPage(this.getUser(), peperoniPizza, this);
	}
	
	/* Call to view - Orders Page*/
	private void displayOrders() {
		//view.getOrdersPage(this.getUser(), this.getCart(), this);
	}

	/* Call to view - Payment Page*/
	private void displayPayment() {
		//view.getPaymentPage(this.getUser(), this.getCart(), this);
	}
	
	/* Call to view - Confirmation Page*/
	private void displayConfirmation() {
		Payment pay = null;
		
		//view.getConfirmationPage(this.getUser(), pay, this);
	}
	
	/* Payment Transaction */
	private String paymentTransaction(Payment pay){
		return null;
	}
	
	/* Shopping Cart Page */
	public static void displayShoppingPage(){
		view.makeShoppingPage();
	}
	
	/* Call to view - Sign Up Page */
	private void displaySignUpPage() {

		view.makeSignUpPage();

	}
	
	/* Call to view - Account Page*/
	public static void displayAccountPage() {
		//view.getAccountPage(this.user, this);
		view.makeAcountPage();
	}
	
//	public ShoppingCart getCart(){
//		return this.cart;
//	}
	
//	public void setCart(ShoppingCart cart){
//		this.cart = cart;
//	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

}

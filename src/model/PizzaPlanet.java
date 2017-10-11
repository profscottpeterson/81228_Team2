package model;

public class PizzaPlanet {
	String name;
	String address;

	Menu menu;
	User user; 
	MenuItem m; //placeholder

	public PizzaPlanet() {

		// Start the app off by demanding that view display this screen...
		view.PizzaPlanetGui.userMenu(null);

	}

	/**
	 * Called from the View to handle the (Guest, Login) option from the first screen
	 * If Strings are passed in, demand API call database to see if User exists
	 * @param usernameIn String; Username passed in by User in GUI
	 * @param passwordIn String; Password passed in by User in GUI
	 */
	public void handleUserClick(String usernameIn, String passwordIn) {
		// TODO: should prolly do some initial validation before calling db
		String username = ""; 
		String password = ""; 

		if (username == ""  && password == "")
		{
			//If this User is a GUEST, use controller below to call next view
			callCategoryScreen();
		} 
		else 
		{
			//If there is a valid User, return it, else returns null
			String ValidUser = Api.validateUser(username, password);

			if (ValidUser == null) 
			{
				//If User is not valid, loop back to the first screen with error message
				view.PizzaPlanetGui.userMenu("Invalid User");
			}
			else
			{
				// If User is valid, create a new User (in state), 
				// then use controller below to call next view
				user = new User(ValidUser);
				callCategoryScreen();
			}
		}
	}
	
	public void handleUserClick() {
		
	}

	/*
	 * Controller: demand that View display the menuCats screen
	 * API: Get ALL menuItems, pass that info to the view
	 * Create a list using the catagory from each item
	 */
	private void callCategoryScreen() {
		//TODO: should prolly parse this info before sending it to the view.
		// could set the state with all the menuItems as a cache so we dont  
		// need to make more calls in the future.
		String menu = Api.getAllMenuItems();  
		
		view.PizzaPlanetGui.menuCats(menu, this.user);
	}

	/**
	 * Called from View Category screen...
	 * @param category String; Type of category User selected
	 */
	public void handleCatMenuClick(String category) {
		//Do something
	}

}

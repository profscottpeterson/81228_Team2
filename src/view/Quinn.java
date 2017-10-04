package view;

import model.PizzaPlanet;
import model.User;

public class Quinn {
	/* Pass in the PizzaPlant so we can call its methods to update the state */
	PizzaPlanet pp;
	
	public Quinn(PizzaPlanet pp) {
		this.pp = pp;
		
		System.out.println("This is Quinn, checking in.");
	}
	
	/* User:
	 * Called from PP
	 * @returns "LOGIN" or "GUEST" based on User input
	 */
	public String getUserType(){
		//change
		return "GUEST";
	}
	
	/*
	 * User:
	 */
	public String[] userLogin() {
		String[] credentials = new String[2];
		String user = ""; //get user input
		String pass = ""; //get user input
		credentials[0] = user;
		credentials[1] = pass;
		
		return credentials;
	}
	
}

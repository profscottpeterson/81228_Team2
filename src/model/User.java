package model;

import java.util.Map;

public class User {

	String userType; /* Type of REGISTERED, GUEST, ADMIN, STAFF */
	String firstName;
	String lastName;
	String street;
	String city;
	String state;
	String zip;
	String userId;
	String phone;
	Map <String, String> payment;
	
	public User() {
		this.userType = "GUEST";
	}
	
	public User(String userT, String fName, String lName, String strt, String cty, String stte, 
				String zp, String uID, String phn)
	{
		userType = userT;
		firstName = fName;
		lastName = lName;
		street = strt;
		city = cty;
		state = stte;
		zip = zp;
		userId= uID;
		phone = phn;
	}//User(all variables)
	
	public User(String name) {
		// TODO Auto-generated constructor stub
		this.firstName = name;
		this.userType = "REGISTERED";
		this.payment.put("type", "value");
		this.payment.put("number", "value");
		this.payment.put("CVC", "value");
	}
	
	/**
	 * When its time to pay, get this info...
	 * @return Map<String, String> payment info
	 */
	public Map <String, String> getUserPayment(){
		return payment;
	}

}

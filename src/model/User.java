package model;

import java.util.Map;

public class User {

	String userName;
	String userType; /* Type of REGISTERED, GUEST, ADMIN, STAFF */
	String firstName;
	String lastName;
	String emailAddress;
	String street;
	String city;
	String state;
	String zip;
	String userId;
	String phone;
	Map <String, String> payment;
	String password;
	
	public User() {
		this.userType = "GUEST";
	}
	
	//constructor without password
	public User(String userName, String userT, String fName, String lName, String email, String strt, String cty, String stte, 
				String zp, String uID, String phn)
	{
		this.userName = userName;
		userType = userT;
		firstName = fName;
		lastName = lName;
		this.emailAddress = email;
		street = strt;
		city = cty;
		state = stte;
		zip = zp;
		userId= uID;
		phone = phn;
	}//User(all variables)
	//constructor with password
	public User(String userName, String userT, String fName, String lName, String email,String strt, String cty, String stte, 
			String zp, String uID, String phn, String pass)
{
	this.userName = userName;
	this.userType = userT;
	firstName = fName;
	lastName = lName;
	this.emailAddress = email;
	street = strt;
	city = cty;
	state = stte;
	zip = zp;
	userId= uID;
	phone = phn;
	password = pass;
}//User(all variables)

	//constructor with only userName and password
	public User(String userName, String pass)
{
	this.userName = userName;
	password = pass;
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

package model;

import java.util.Map;

public class User {

	private String userName;
	private String userType; /* Type of REGISTERED, GUEST, ADMIN, STAFF */
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String street;
	private String city;
	private String state;
	private String userId;
	private String phone;
	private Map <String, String> payment;
	String password;
	
	public User() {
		this.setUserType("GUEST");
	}
	
	//constructor without password
	public User(String userName, String userT, String fName, String lName, String email, String strt, String cty, String stte, 
				 String uID, String phn)
	{
		setUserName(userName);
		setUserType(userT);
		setFirstName(fName);
		setLastName(lName);
		setEmailAddress(email);
		setStreet(strt);
		setCity(cty);
		setState(stte);
		setUserId(uID);
		setPhone(phn);
	}//User(all variables)
	//constructor with password
	public User(String userName, String userT, String fName, String lName, String email,String strt, String cty, String stte, 
			 String uID, String phn, String pass)
{
	setUserName(userName);
	setUserType(userT);
	setFirstName(fName);
	setLastName(lName);
	setEmailAddress(email);
	setStreet(strt);
	setCity(cty);
	setState(stte);
	setUserId(uID);
	setPhone(phn);
	password = pass;
}//User(all variables)

	//constructor with only userName and password
	public User(String userName, String pass)
{
	this.setUserName(userName);
	password = pass;
}//User(all variables)
	
	public User(String name) {
		// TODO Auto-generated constructor stub
		this.setFirstName(name);
		this.setUserType("REGISTERED");
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

	public String getUserName() {
		return userName;
	}

	public String setUserName(String userName) {
		this.userName = userName;
		return userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String setFirstName(String firstName) {
		this.firstName = firstName;
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String setLastName(String lastName) {
		this.lastName = lastName;
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return emailAddress;
	}

	public String getStreet() {
		return street;
	}

	public String setStreet(String street) {
		this.street = street;
		return street;
	}

	public String getCity() {
		return city;
	}

	public String setCity(String city) {
		this.city = city;
		return city;
	}

	public String getState() {
		return state;
	}

	public String setState(String state) {
		this.state = state;
		return state;
	}

	public String getPhone() {
		return phone;
	}

	public String setPhone(String phone) {
		this.phone = phone;
		return phone;
	}

	public String getUserType() {
		return userType;
	}

	public String setUserType(String userType) {
		this.userType = userType;
		return userType;
	}

	public String getUserId() {
		return userId;
	}

	public String setUserId(String userId) {
		this.userId = userId;
		return userId;
	}

}

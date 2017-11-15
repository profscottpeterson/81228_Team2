package model;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class UserTest {

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
	
	@Test
	public void testUser() {
		User u = new User();
		equals(u.userType = "GUEST");
	}

	@Test
	public void testUserNoPassword() {
		User u = new User("abc123","REGISTERED","Henry","Illgen","sa@gmail.com","123 This Ave","Green Bay", "WI", "54301","abc123","9205558497","abc123");
		equals(u.userName = "abc123");
		equals(u.userType = "REGISTERED");
		equals(u.firstName = "Henry");
		equals(u.lastName = "Illgen");
		equals(u.emailAddress = "sa@gmail.com");
		equals(u.street = "123 This Ave");
		equals(u.city= "Green Bay");
		equals(u.state = "WI");
		equals(u.zip = "54301");
		equals(u.userId = "abc123");
		equals(u.phone = "9205558497");
		equals(u.password = "abc123");
	}

	@Test
	public void testUserWithPassword(){
		User u = new User("abc123","REGISTERED","Henry","Illgen","sa@gmail.com","123 This Ave","Green Bay", "WI", "54301","abc123","9205558497");
		equals(u.userName = "abc123");
		equals(u.userType = "REGISTERED");
		equals(u.firstName = "Henry");
		equals(u.lastName = "Illgen");
		equals(u.emailAddress = "sa@gmail.com");
		equals(u.street = "123 This Ave");
		equals(u.city= "Green Bay");
		equals(u.state = "WI");
		equals(u.zip = "54301");
		equals(u.userId = "abc123");
		equals(u.phone = "9205558497");
	}

	@Test
	public void testUserStringString() {
		User u = new User("abc123","abc123");
		equals(u.userName = "abc123");
		equals(u.password = "abc123");
	}

	@Test
	public void testUserString() {
		//User u = new User("Henry");
		//equals(u.firstName = "Henry");
		//equals(u.userType = "REGISTERED");
	}

	@Test
	public void testGetUserPayment() {
		
	}

}

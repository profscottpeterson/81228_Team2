package model;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.junit.Test;

public class ApiTest {

	
	
	@Test
	public void testIsThisValidUser() {
	
	boolean test = Api.IsThisValidUser("abc123", "abc123");
	assertTrue(test);
	}

	@Test
	public void testCreateUserInformation() {
		
		User u = Api.CreateUserInformation("abc123");
	}

	@Test
	public void testGetFoodTypes() {
		HashMap<String,String> myMap = Api.GetFoodTypes();
	}

	@Test
	public void testGetMenu() {
		Menu m = Api.GetMenu("3");
	}

	@Test
	public void testGetAllMenuItems() {
		//returns null at the moment
	}

}

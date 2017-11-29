package model;

import java.sql.SQLException;

public class CreateUserDB extends Api{

	public static boolean CreateUser(User u) {					
		boolean successful = false;
		System.out.println("CreateUser Called");
		if(c !=null) {
			//the blue are the fields in the database, the black are variables passed into the
			//method.
			//generate new salt for the user
			String[] tempArray = new String[2];
			byte[] salt = Hash.getNewSalt();
			u.setUserType("C");
			//hash the users password with the salt
			tempArray = Hash.md5Hash(u.password,salt);	
			rs = GetResultSet("Select * from Users where userName = " + "\'" + u.getUserName() + "\'");
			try {
				if (!rs.next()) {
					//if no users are found add them into our DB
					rs = GetResultSet("Insert into Users (userName, password,Fname,Lname,Address,PhoneNum,City,state,usertype,salt)Values (\'" + u.getUserName() + "\', \'" + tempArray[0] + 
							"\',\'" + u.getFirstName() + "\', \'" + u.getLastName() + "\',\'" + u.getStreet() + "\',\'" + u.getPhone() + "\',\' " + u.getCity() + "\',\'" + u.getState() + "\',\'" + u.getUserType()  + "\',\'"  + tempArray[1] + "\')");			
						successful = true; 
						System.out.println("Creating new user");
				}
				else{				
					System.out.println("Username already taken");
				}
			} catch (SQLException e) {e.printStackTrace();}
		}//if		
		Api.CloseStuff();
		return successful;				
	}//CreateUser(User u)
}//CreateUserDB
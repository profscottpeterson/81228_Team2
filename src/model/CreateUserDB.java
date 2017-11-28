package model;

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
			u.userType = "C";
			//hash the users password with the salt
			tempArray = Hash.md5Hash(u.password,salt);	
			
			//have to get this statement working correctly. 
			//rs = GetResultSet("Select * from Users where userName = " + "\'" + u.userName + "\'");
			
			//check to make sure no users have that userName already. need to fix this if statement.
			if (rs == null) {
				//if no users are found add them into our DB
				rs = GetResultSet("Insert into Users (userName, password,Fname,Lname,Address,PhoneNum,City,state,usertype,salt)Values (\'" + u.getUserName() + "\', \'" + tempArray[0] + 
						"\',\'" + u.getFirstName() + "\', \'" + u.getLastName() + "\',\'" + u.getStreet() + "\',\'" + u.getPhone() + "\',\' " + u.getCity() + "\',\'" + u.getState() + "\',\'" + u.userType  + "\',\'"  + tempArray[1] + "\')");			
					successful = true; 
					System.out.println("Creating new user");
			}
			else{				
				System.out.println("Username already taken");
			}
		}		
		Api.CloseStuff();
		return successful;				
	}
}
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
			
			//hash the users password with the salt
			tempArray = Hash.md5Hash(u.password,salt);	
			
			//rs = GetResultSet("Select * from Users where userName = " + "\'" + u.userName + "\'");
			
			//check to make sure no users have that userName already.
			if (rs == null) {
				//if no users are found add them into our DB
				// zipCode, userType, salt
				rs = GetResultSet("Insert into Users (userName, password,Fname,Lname,Address,PhoneNum,City, salt)Values (\'" + u.userName + "\', \'" + tempArray[0] + 
						"\',\'" + u.firstName + "\', \'" + u.lastName + "\',\'" + u.street + "\',\'" + u.phone + "\',\' " + u.city + "\',\'"  + tempArray[1] + "\')");
				if (rs == null) {
					successful = true; //expecting commands completed successfully. That should be null I would think
					//we will have to do some testing on this one. 
				}
			}	
		}
		System.out.println("Creating new user");
		Api.CloseStuff();
		return successful;		
		
	}

}

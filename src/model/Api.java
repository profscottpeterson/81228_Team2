package model;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Api {
	
	//Database variables and connection information from the School Server if it ever works
	//DO NOT UPDATE THIS
	private static final String DB_URL = "jdbc:sqlserver://bitweb3.nwtc.edu;databaseName=dbsoftdev1";//integratedSecurity=true";
	private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String USER = "dbsoftdev1";
	private static final String PASS = "XZ36KrMB}n";
	protected static Connection c = CreateConnection();
	protected static ResultSet rs = null;
	protected static Statement st = null;
	
	public static Connection CreateConnection()
	{
		Connection con; //holds connection to db
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(DB_URL,USER,PASS);
		}catch(SQLException se) {
			System.out.println("You got this SQL error: " +se);
			con = null;
		}catch(Exception e){
			System.out.println("You got this error: " +e);
			con = null;
		}
		return con;
	}//CreateConnection
	
	public static ResultSet GetResultSet(String sql)
	{
		if(c !=null)
		{
			System.out.println("Into the database...");
			try {
				st = c.createStatement(); //Creates the ability for statement to be created
				rs = st.executeQuery(sql);//sql string holds the SQL we want a result set returned from
			}catch(SQLException se) {
				System.out.println("You got this SQL error: " +se);
				rs = null;
			}catch(Exception e){
				System.out.println("You got this error: " +e);
				rs = null;
			}
		}//if
		if(rs == null)
		{rs = null;}//if created to stop java from yelling about rs never being used.
		return rs;
	}//GetResults
	
	public static boolean IsThisValidUser(String username, String password)
	{
		rs = GetResultSet("Select u.Username, u.Password, u.Salt From Users u where u.Username = \'"+username+"\'");
		boolean validUserPassCombo = false; //true only if they are equal to the username and password sent in;
		String uName = null;
		String pass = null;
		byte[] salt = null;
		String StringOfSalt = "";
		String HashedPassword = "";
		String[] values = new String[2];
		try {
			if(rs != null) 
			{
				while(rs.next())
				{
					System.out.println("Testing UserName to database...");
					uName = rs.getString("Username");
					pass = rs.getString("Password");
					salt = rs.getBytes("Salt");
					
					values = Hash.md5Hash(password, salt);
					
				}//while
			}else {validUserPassCombo = false;} //turn this false because rs returned nothing so maybe incorrect casing for username
		}catch(SQLException s) {s.printStackTrace();}
		
		if(uName.equals(username) && pass.equals(values[0]))		
		{validUserPassCombo = true;}
		else {validUserPassCombo = false;}
		CloseStuff();//close the resultset
		return validUserPassCombo;
	}//IsThisValidUser
	
	public static User CreateUserInformation(String username)
	{
		User u = null;
		rs = GetResultSet("Select UserId,FName,LName,Address,PhoneNum,City,State,ZipCode,UserType From Users where Username =\'" +username+"\'");
		String userType = null;
		String firstName = null;
		String lastName = null;
		String street = null;
		String city = null;
		String state = null;
		String zip = null;
		String userId = null;
		String phone = null;
		System.out.println("Creating User Name");
		try {
			if(rs != null) 
			{
				while(rs.next())
				{
					userType = rs.getString("UserType");
					firstName = rs.getString("FName");
					lastName = rs.getString("LName");
					street = rs.getString("Address");
					city = rs.getString("City");
					state = rs.getString("State");
					zip = rs.getString("ZipCode");
					userId = rs.getString("UserId");
					phone = rs.getString("PhoneNum");
				}//while
				//u = new User(userType,firstName,lastName,street,city,state,zip,userId,phone);
			}else {u = null;}
		}catch(SQLException s) {s.printStackTrace();}
		CloseStuff();
		return u;
	}//CreateUserInformation

	//This will get the 2nd View displaying all the available categories of food
	//Pizzas, Subs, Wings, Sodas [categories of food]
	public static HashMap<String,String> GetFoodTypes()
	{
		rs = GetResultSet("Select * from Food_Types");
		//ArrayList<Map<String, String>> fCategories = new ArrayList<Map<String,String>>();
		HashMap<String,String> myMap = new HashMap<String,String>();
		System.out.println("I'm looking it all the food categories");
		try {
			if(rs != null) 
			{
				while(rs.next())
				{
					String id = rs.getString("FType_ID");
					String name = rs.getString("FType_name");
					myMap.put(id, name);
				}//while
			}else {myMap = null;}
		}catch(SQLException s) {s.printStackTrace();}
		CloseStuff();		
		System.out.println(myMap);
		return myMap;
	}//GetFoodTypes
	
	//This is when you are getting a specific Menu Item group
	//All pizza's or all subs returned but not both
	public static Menu GetMenu(String indexFoodWanted)
	{
		Menu dontuse = null;
		rs = GetResultSet("Select f.Food_ID, f.Food_Name from Foods f where f.FType_ID =\'"+indexFoodWanted+"\'" );
		HashMap<String,String> myMap = new HashMap<String,String>();
		System.out.println("I'm looking it all the food categories");
		try {
			if(rs != null) 
			{
				while(rs.next())
				{
					String foodId = rs.getString("Food_ID");
					String name = rs.getString("Food_Name");
					myMap.put(foodId,name);
				}//while
			}else {myMap = null;}
		}catch(SQLException s) {s.printStackTrace();}
		CloseStuff();	
		System.out.println(myMap);
		return dontuse;
	}//GetPizza

	public static String getAllMenuItems() {
		return null;
	}//getAllMenuItems
	
	public static void CloseStuff()
	{
		try {
			if(rs !=null)
			{rs.close();}//if
		}catch(SQLException se) {}//nothing we can do
	}//CloseStuff
}//API
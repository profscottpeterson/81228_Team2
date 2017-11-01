package model;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Map;

public class Api {
	
	//Database variables and connection information from the School Server if it ever works
//	//DO NOT UPDATE THIS
//	private static final String DB_URL = "jdbc:sqlserver://bitweb3.nwtc.edu;databaseName=dbsoftdev1;integratedSecurity=true";
//	//private static final String DB_URL = "jdbc:sqlserver://11.0.6251.0:1433/dbsoftdev1";
//	private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	private static final String USER = "softdevuser1";
//	private static final String PASS = "XZ36KrMB}n";
	
	//this is from the phpmyadmin
	//DO NOT UPDATE THIS
	private static final String DB_URL = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9202256";
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String USER = "sql9202256";
	private static final String PASS = "5NUvUnrQ2g";
	private static Connection c = CreateConnection();
	private static ResultSet rs = null;
	private static Statement st = null;
	
	private static Connection CreateConnection()
	{
		Connection con; //holds connection to db
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			//con.close(); //this is the last thing that needs to be completed once we want to close the DB Connection
		}catch(SQLException se) {
			System.out.println("You got this SQL error: " +se);
			con = null;
		}catch(Exception e){
			System.out.println("You got this error: " +e);
			con = null;
		}
		return con;
	}//CreateConnection
	
	private static ResultSet GetResultSet(String sql)
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
		CloseStuff();//close the resultset
		return rs;
	}//GetResults
	
	public static boolean IsThisValidUser(String username, String password)
	{
		rs = GetResultSet("Select u.Username, u.Password From Users u where u.Username = \'"+username+"\'");
		boolean validUserPassCombo = false; //true only if they are equal to the username and password sent in;
		String uName = null;
		String pass = null;
		try {
			if(rs != null) 
			{
				while(rs.next())
				{
					System.out.println("Testing UserName to database...");
					uName = rs.getString("Username");
					pass = rs.getString("Password");
				}//while
			}else {validUserPassCombo = false;} //turn this false because rs returned nothing so maybe incorrect casing for username
		}catch(SQLException s) {s.printStackTrace();}
		if(uName.equals(username) && pass.equals(password))
		{validUserPassCombo = true;}
		else {validUserPassCombo = false;}
		CloseStuff();//close the resultset
		return validUserPassCombo;
	}//IsThisValidUser
	
	private static void CloseStuff()
	{
		try {
			if(rs !=null)
			{rs.close();}//if
		}catch(SQLException se) {}//nothing we can do
	}//CloseStuff
	
	public static User CreateUserInformation(String username)
	{
		User u = null;
		rs = GetResultSet("Select UserId,FName,LName,Address,Phone,City,State,ZipCode,UserType From Users where Username =\'" +username+"\'");
		String userType = null;
		String firstName = null;
		String lastName = null;
		String street = null;
		String city = null;
		String state = null;
		String zip = null;
		String userId = null;
		String phone = null;
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
					phone = rs.getString("Phone");
				}//while
				u = new User(userType,firstName,lastName,street,city,state,zip,userId,phone);
			}else {u = null;}
		}catch(SQLException s) {s.printStackTrace();}
		CloseStuff();
		return u;
	}//CreateUserInformation

	public static ArrayList<Map<String,String>> GetFoodTypes()
	{
		ResultSet rs = GetResultSet("Select * from Food_Types");
		ArrayList<Map<String, String>> fType = new ArrayList<Map<String,String>>();
		try {
			if(rs != null) 
			{
				while(rs.next())
				{
					String name = rs.getString("FType_name");
					
//					fType.add(name);
					
					
				}//while
			}else {fType = null;}
		}catch(SQLException s) {s.printStackTrace();}
		return fType;
	}//GetFoodTypes
	
	public static Menu GetMenu(String catID)
	{	
		/* Henry, we are passing in the ID of the Menu to retrieve, return me a Menu*/
		Menu dontuse = null;
		
		if(c !=null)
		{
			try {
				st = c.createStatement(); //sql query
				String sql = "select * from foods where foods.FType_id = 1";
				rs = st.executeQuery(sql);
			}catch(SQLException se) {
				System.out.println("You got this SQL error: " +se);
				rs = null;
			}catch(Exception e){
				System.out.println("You got this error: " +e);
				rs = null;
			}finally {
				//close the SQL Statement
				try {
					if(st !=null)
					{st.close();}//if
				}catch(SQLException se) {}//nothing we can do
				//close the connection
				try {
					if(c != null)
					{c.close();}//if
				}catch(SQLException s) {s.printStackTrace();}
			}//finally
		}//if
		else {return dontuse = null;}
		
		
		return dontuse;
		
	}//GetPizza

	public static String getAllMenuItems() {
		return null;
	}//getAllMenuItems

}//API
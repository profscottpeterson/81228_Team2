package model;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class Api {
	
	//Database variables and connection information
	//DO NOT UPDATE THIS!
	private static final String DB_URL = "bitweb3.nwtc.edu";
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String USER = "softdevuser1";
	private static final String PASS = "XZ36KrMB}n";
	
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
	
	private static ArrayList<String> GetFoodTypes()
	{
		Connection c = CreateConnection();
		ResultSet rs = null;
		Statement st = null;
		if(c !=null)
		{
			try {
				st = c.createStatement(); //sql query
				String sql = "Select * from Food_Types";
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
		ArrayList<String> fType = new ArrayList<String>();
		try {
			if(rs != null) 
			{
				while(rs.next())
				{
					String name = rs.getString("FType_name");
					fType.add(name);
				}//while
			}else {fType = null;}
		}catch(SQLException s) {s.printStackTrace();}
		return fType;
	}//GetFoodTypes
	
	private static ResultSet GetPizza()
	{
		Connection c = CreateConnection();
		ResultSet rs = null;
		Statement st = null;
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
		else {return rs = null;}
		return rs;
	}//GetPizza
		
	 /**
	 * API: returns a csv String with all User info if valid, else returns null
	 * ex: "John, Doe, 123 Main St., Green Bay, WI, ..."
	 * @param username String
	 * @param password String
	 * @return String || null
	 */
	public static String validateUser(String username, String password){
		Connection c = CreateConnection();
		ResultSet rs = null;
		Statement st = null;
		if(c !=null)
		{
			try {
				st = c.createStatement(); //sql query
				String sql = "Select * From Users where UserName = " +username;
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
		//Result Set comes back needs to append into correct UserValues
		
		//if user is valid, return a new User("User info")
		return null;
	}//validateUser	
	/**
	 * API: returns <type>?> with all the MenuItems
	 * @returns <type?>
	 */
	public static String getAllMenuItems() {
		return null;
	}//getAllMenuItems
}//API
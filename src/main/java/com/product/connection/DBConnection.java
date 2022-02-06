package com.product.connection;
import java.sql.*; 
public class DBConnection 
{
	public DBConnection(String url, String username, String password) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) 
	{
		Connection con=null; 
		try{Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
		if
		(!con.isClosed())System.out.println("Successfully connected to MySQL server...");
		}
		catch
		(Exception e)
		{
			System.err.println("Exception: "+e.getMessage());
			}
		finally{try{if(con!=null)con.close();}catch(SQLException e)
		{
			
		}}}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		
	}}


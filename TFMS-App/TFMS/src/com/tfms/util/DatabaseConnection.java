package com.tfms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {


		public static Connection getConnection(){
			Connection con  = null;	
			try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            String user="root";
	            String pass="vinay1111";
	            String url = "jdbc:mysql://localhost:3306/tfms";

	       con = DriverManager.getConnection(url,user,pass);
	            System.out.println("Connection SuccessFull");
	            
	             System.out.println(con);

	        }
	        catch(Exception ex){
	           System.out.println(ex.getMessage());;
	        }
			return con;
		}
}
			
	        
			
			

		
		

	





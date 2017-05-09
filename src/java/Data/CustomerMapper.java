/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Utilities.DBconnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.Customer;

/**
 *
 * @author felesiah
 */
public class CustomerMapper {
 static Connection Con;
 static ResultSet rs = null; 
 
    public CustomerMapper() {
        
   Con = new DBconnector().getConnection();
   }
   public static Customer login(Customer customer) throws SQLException{
          //preparing some objects for connection 
         Statement stmt = null;    
	
         String username = customer.getUserName();    
         String password = customer.getPassword();   
	    
         String searchQuery =
               "select * from customer where username='"
                        + username
                        + "' AND password='"
                        + password
                        + "'";
         // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Your user name is " + username);          
      System.out.println("Your password is " + password);
      System.out.println("Query: "+searchQuery);
         
       try 
      {
         //connect to DB 
         Con = new DBconnector().getConnection();
         stmt=Con.createStatement();
         rs = stmt.executeQuery(searchQuery);	        
         boolean more = rs.next();
	       
         // if customer does not exist set the isValid variable to false
         if (!more) 
         {
            System.out.println("Sorry, you are not a registered user! Please sign up first");
            customer.setValid(false);
         } 
           //if customer exists set the isValid variable to true
         else if (more) 
         {
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
	     	
            System.out.println("Welcome " + firstName);
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setValid(true);
         }
     } 
         catch (Exception ex) 
      {
         System.out.println("Log In failed: An Exception has occurred! " + ex);
      } 
	    
      //some exception handling
      finally 
  {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (Con != null) {
            try {
               Con.close();
            } catch (Exception e) {
            }

            Con = null;
         }
      }

return customer;
	
      }	
   }
      
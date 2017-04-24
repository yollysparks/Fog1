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
import Model.User;

/**
 *
 * @author felesiah
 */
public class UserDAO {
  static Connection Con = null;
  static ResultSet rs = null; 
      
     public static User login(User user) throws SQLException{
          //preparing some objects for connection 
         Statement stmt = null;    
	
         String username = user.getUserName();    
         String password = user.getPassword();   
	    
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
	       
         // if user does not exist set the isValid variable to false
         if (!more) 
         {
            System.out.println("Sorry, you are not a registered user! Please sign up first");
            user.setValid(false);
         } 
           //if user exists set the isValid variable to true
         else if (more) 
         {
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
	     	
            System.out.println("Welcome " + firstName);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setValid(true);
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

return user;
	
      }	
   }
      

           
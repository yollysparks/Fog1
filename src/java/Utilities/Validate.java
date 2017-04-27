/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Casper
 */
public class Validate {

public static boolean checkUser(String email, String pass) throws ClassNotFoundException, SQLException
{
    boolean st = false;
    
    try{
        // Load drivers
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/test2","root","bjw7kt9h4vm");
        
        PreparedStatement ps =con.prepareStatement("select * from customer where email=? and pass =?");
        ps.setString(1, email);
        ps.setString(2, pass);
        ResultSet rs =ps.executeQuery();
        
    } catch(Exception e)
    {
    e.printStackTrace();
    
    }
    return st;
    
}
}



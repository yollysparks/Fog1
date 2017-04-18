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
import model.User;

/**
 *
 * @author felesiah
 */
public class UserMapper {
 private Connection con;
    public UserMapper() {
        
   con = new DBconnector().getConnection();
   }
   public User getUserName(String name){
       ResultSet rs = null;
        Statement stmt = null;
        User user = null;
        String SQLString
                = "select name "
                + "from Customer "
                + "where name = " + name;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                 user = new User(name,
                        rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Fail in userMapper - getUserByName");
            System.out.println(e.getMessage());
        }       
        return user;
   }
   public User getUserByPswd (String pswd){
   ResultSet rs = null;
        Statement stmt = null;
        User password = null;
        String SQLString
                = "select name "
                + "from customer "
                + "where eno = " + pswd;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                 password = new User(rs.getString(1),
                         pswd);
            }
        } catch (SQLException e) {
            System.out.println("Fail in UserMapper - getUserByPswd");
            System.out.println(e.getMessage());
        }       
        return password;
   }
    
}

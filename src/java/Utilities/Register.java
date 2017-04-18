/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felesiah
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

//   
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
// 
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out = response.getWriter();
            String name =request.getParameter("username");
            String fname =request.getParameter("firstname");
            String lname =request.getParameter("lastname");
            String pswd =request.getParameter("password");
            String email =request.getParameter("email");
            String address =request.getParameter("address");
            String zipcode =request.getParameter("zipcode");
            String phone = request.getParameter("phone");
            
          try{ 
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");
        //creating connection with the database 
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/carport?useSSL=false");
        PreparedStatement ps = con.prepareStatement("INSERT INTO `carport`.`customer`"
                                                + "(`username`,`firstname`,`lastname`,"
                                   + "`password`,`email`,`address`,`zipcode`,`phone`)"
                                  + "VALUES(?,?,?,?,?,?,?,?)");
             ps.setString(1,name);
             ps.setString(2,fname);
             ps.setString(3,lname);
             ps.setString(4,pswd);
             ps.setString(5,email);
             ps.setString(6,address);
             ps.setString(7,zipcode);
             ps.setString(8,phone);
             int i = ps.executeUpdate();
             
              if(i>0)
                 out.print("You are succesfully registered...");       
             } 
           catch(ClassNotFoundException | SQLException se) {
        }
            
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

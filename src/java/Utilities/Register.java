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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

String name,fname,lname,pswd,email,address,zipcode,phone;  
String query;  
Connection conn;  
Statement stmt;  
ResultSet res;  
DBconnector dbconn;  
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
        try {  

 dbconn=new DBconnector();  
             name =request.getParameter("username");
             fname =request.getParameter("firstname");
             lname =request.getParameter("lastname");
             pswd =request.getParameter("password");
             email =request.getParameter("email");
             address =request.getParameter("address");
             zipcode =request.getParameter("zipcode");
             phone = request.getParameter("phone");
       
             conn=dbconn.getConnection(); 
             stmt=conn.createStatement();  
query= "insert into customer(username,firstname,lastname,password,email,address,zipcode,phone)"+  
" values('"+name+"','"+fname+"','"+lname+"','"+ pswd+"',"+email+",'"+address+"',"+zipcode+",'"+ phone+"')";  
int i=stmt.executeUpdate(query);  
   if (i == 0){
       out.print("You must register!!!");
    forward("/register.jsp", request, response);
}
   else
       out.print("Welcome!!");
    
} catch(SQLException | ServletException | IOException e){  
out.println("Error"); 
forward("/Login.jsp", request, response);

}finally {  

out.close();  
}  
    }
 private void forward( String url, HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        getServletContext()
                .getRequestDispatcher( url ) 
                .forward( request, response );
    }
 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       processRequest(request, response);
        
}
}

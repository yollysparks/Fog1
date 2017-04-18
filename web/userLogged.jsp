<%-- 
    Document   : userLogged
    Created on : 09-04-2017, 14:32:24
    Author     : felesiah
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>   User Logged Successfully   </title>
      </head>
	
      <body>

         <center>
       <%User currentUser = (User(ses.getAttribute("currentUser"));%>
			
            Welcome <%= currentUser.getFirstName() + " " + currentUser.getLastName() %>
         </center>

    </body>
</html>

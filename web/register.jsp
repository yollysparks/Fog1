<%-- 
    Document   : register
    Created on : 07-04-2017, 13:40:10
    Author     : Casper & Feleiash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSSz.css">
        <title> Register page</title>
        </head>
        <body>
        <div class="form">
    <form  method="POST" action="Register">
        UserName:
        <input type="text" name="userName" value="" />
        <br/><br/>
        First Name:
        <input type="text" name="FirstName" value="" />
        <br/><br/>
        Last Name:
        <input type="text" name="lastName" value="" />
        <br/><br/>
        Password:
        <input type="password" name="password" value="" />
        <br/><br/>
        Email:
        <input type="text" name="email" value="" />
        <br/><br/>
        Address:
        <input type="text" name="address" value="" />
        <br/><br/>
        Zipcode:
        <input type="text" name="zipcode" value="" />
        <br/><br/>
        Phone:
        <input type="text" name="phone" value="" />
        <br/><br/>
        <input type="Submit"  value="Register" />
        
        <br/> <br/>       
             </form> 
         </div>
    </body>
</html>

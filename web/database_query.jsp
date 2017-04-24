<%-- 
    Document   : database_querry
    Created on : 23-04-2017, 11:35:47
    Author     : felesiah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>display data from the table using jsp</title>
    </head>
    <body>
        <TABLE style="background-color: #ffffcc;">
<TR>  
<TD align="center"><h2>To display the data from the 
table click here...</h2></TD>
</TR>
<TR>
    <TD>
        <select name="Carpor Styles">
            <option>Flat roof</option>
            <option>Raised roof</option>
        </select><A HREF="connectJspToMysql.jsp">
<font size="4" color="blue">show data from table</font>
</A></TD>
</TR>
</TABLE>
    </body>
</html>

<%-- 
    Document   : CarportPartsGenerated
    Created on : Apr 22, 2017, 4:44:11 PM
    Author     : Jack
--%>

<%@page language='java' contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Total Prise is : <% out.print(session.getAttribute("finalPrice"));%>
        <br>
        # of parts: <% out.print(session.getAttribute("numberOfParts"));%>
        
        <SVG ...>
    </body>
</html>

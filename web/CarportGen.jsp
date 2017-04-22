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
        <br>
        <div>
        <svg width="640" height="480" xmlns="http://www.w3.org/2000/svg" xmlns:svg="http://www.w3.org/2000/svg">
 <!-- Created with SVG-edit - http://svg-edit.googlecode.com/ -->
 <g>
  <title>Layer 1</title>
  <rect fill="#ffffff" stroke-width="2" stroke-dasharray="null" stroke-linejoin="null" stroke-linecap="null" x="20" y="20" width="200" height="5" id="svg_3" stroke="#000000"/>
  <rect stroke="#000000" fill="#ffffff" stroke-width="2" stroke-dasharray="null" stroke-linejoin="null" stroke-linecap="null" x="20" y="26" width="5" height="40" id="svg_2"/>
  <rect id="svg_1" fill="#ffffff" stroke-width="2" stroke-dasharray="null" stroke-linejoin="null" stroke-linecap="null" y="26" width="5" height="40" stroke="#000000" x="115"/>
  <rect fill="#ffffff" stroke-width="2" stroke-dasharray="null" stroke-linejoin="null" stroke-linecap="null" y="26" width="30" height="40" x="190" id="svg_4" stroke="#000000"/>
  <rect id="svg_6" height="45.6" width="100" y="144.1" x="70.4" stroke-linecap="null" stroke-linejoin="null" stroke-dasharray="null" stroke-width="2" fill="#ffffff" stroke="#000000"/>
 </g>
</svg>
</div>
    </body>
</html>

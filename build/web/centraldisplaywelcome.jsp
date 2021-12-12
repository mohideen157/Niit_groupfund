<%-- 
    Document   : adminwelcome
    Created on : Aug 19, 2016, 8:21:24 AM
    Author     : Rosheinee
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Welcome <%=session.getAttribute("tno")%></title>
</head>
<body>
    <h3>CENTRAL DISPLAY</h3>
    <h4>
        CURRENT STATUS,<br/>
        It is in processing
        <%=session.getAttribute("tno")%></h4>
</body>
</html>

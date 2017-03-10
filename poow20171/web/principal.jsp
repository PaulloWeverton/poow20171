<%-- 
    Document   : principal
    Created on : 23/02/2017, 22:34:59
    Author     : Laboratorio
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%--DECLARAÇÃO--%>
       
        <%
            int contaVisitantes = 0;
        %>
        
        %>
        <%--SCRIPTLET--%>
        <%
            out.println("mais um jeito de código java");
            out.println("Visitante: "+(++contaVisitantes));
           %>
           <%--EXPESSION--%>
           Data: <%= (new Date()).toInstant()%>
    </body>
</html>
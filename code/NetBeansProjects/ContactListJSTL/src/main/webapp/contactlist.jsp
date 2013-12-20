<%-- 
    Document   : contactlist
    Created on : Nov 6, 2013, 3:26:58 PM
    Author     : apprentice
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact List</title>
    </head>
    <body>
        <h1>Company Contacts</h1>
    
    <!-- Iterate over contactList:forEach contact in contactList, do something -->    
    <c:forEach var="contact" items="${contactList}">
        <c:if test="${contact.name=='John Doe'}">
              CEO<br>
    </c:if>
        Name:${contact.name}<br/>
        Phone: ${contact.phone}<br/>
        Email:${contact.email}<br/>
        <hr>
        
        
    </c:forEach> 
    </body>
</html>

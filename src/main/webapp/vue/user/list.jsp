<%@ page import="com.groupeisi.scolarite.entities.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: modyn
  Date: 29/11/2022
  Time: 00:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>Id</td>
        <td>Email</td>
    </tr>
    <%
        List<User> liste = (List<User>) request.getAttribute( "users" );
        for( User i : liste ){
    %>
    <tr>
        <td><%= i.getId() %>  </td>
        <td><%= i.getEmail() %>  </td>
    </tr>
    <% } %>
</table>
</body>
</html>

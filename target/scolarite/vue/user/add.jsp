<%@ page import="com.groupeisi.scolarite.entities.Roles" %>
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
<% if(request.getAttribute("success") != null) {%>
<div style="background-color: greenyellow; margin-bottom: 30px; text-align: center; border-radius: 30px; padding: 10px; color: black"><%=request.getAttribute("success")%></div>
<%}%>
<form action="/User" method="post">
    <label>Email User</label>
    <input type="email" name="email"> <br>
    <label>Password User</label>
    <input type="password" name="pass"> <br>
    <label>Role User</label>
    <select name="roles" id="">
        <%
            List<Roles> liste = (List<Roles>) request.getAttribute( "roles" );
            for( Roles i : liste ){
        %>
         <option value="<%= i.getId() %>"><%= i.getName() %></option>
        <% } %>

    </select>
    <input type="submit" value="Enregistrer"> <br>

    <a href="/Home">Allez à l'accueil</a>
</form>
</body>
</html>

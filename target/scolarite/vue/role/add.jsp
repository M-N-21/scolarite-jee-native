<%--
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
<form action="/Role" method="post">
    <label>Nom Role</label>
    <input type="text" name="name">
    <input type="submit" value="Enregistrer"> <br>

    <a href="/home">Allez à l'accueil</a>
</form>
</body>
</html>

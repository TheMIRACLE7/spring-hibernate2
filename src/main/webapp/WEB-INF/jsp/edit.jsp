<%--
  Created by IntelliJ IDEA.
  User: Мирошниченко
  Date: 12.2.2016
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Editing user</title>
</head>
<body>

<form:form modelAttribute="userAttribute" method="post" action="edit?id=${userAttribute.id}">
    <table>
        <tr>
            <td>Id</td>
            <td><form:input path="id" disabled="true"/> </td>
        </tr>
        <tR>
            <td>Name</td>
            <td><form:input path="name"/> </td>
        </tR>
        <tr>
            <td>Age</td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td>isAdmin</td>
            <td><form:checkbox path="admin"/></td>
        </tr>
    </table>

    <input type="submit" value="Save"/>
</form:form>
</body>
</html>

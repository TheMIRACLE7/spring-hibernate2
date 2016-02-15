<%--
  Created by IntelliJ IDEA.
  User: Мирошниченко
  Date: 12.2.2016
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Adding user</title>
</head>
<body>

<form:form modelAttribute="userAttribute" method="POST" action="add">
    <table>
        <tr>
            <td>Name</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><form:input path="age"/></td>
        </tr>
            <td>isAdmin</td>
            <td><form:checkbox path="admin" /></td>
        </tr>
    </table>

    <input type="SUBMIT" value="Add" />
</form:form>

</body>
</html>

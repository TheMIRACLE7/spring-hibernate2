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
    <title>Take me to search</title>
</head>
<body>

<form method="get" action="search">
    <table>
        <tr>
            <td>Id</td>
            <td><input name="id" type="text" /> </td>
        </tr>
        <tR>
            <td>Name</td>
            <td><input name="name" type="text" /> </td>
        </tR>
        <tr>
            <td>Age</td>
            <td><input name="age" type="text" /></td>
        </tr>
        <tr>
            <td>isAdmin</td>
            <td><input type="checkbox" name="isAdmin"/></td>
        </tr>
    </table>

    <input type="submit" value="Search"/>
</form>

<a href="/">Main page</a><bR/>
</body>
</html>

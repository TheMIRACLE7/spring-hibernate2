<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Search results</title>
</head>
<body>
<h2>Search results</h2>

<table style="border: 1px solid; width: 500px; text-align:center">
    <thead style="background:#fcf">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Age</th>
        <th>Admin</th> <!-- сделать галочкой -->
        <th>Created Date</th>
        <th colspan="2"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}" /></td>
            <td><c:out value="${user.name}" /></td>
            <td><c:out value="${user.age}" /></td>
            <td><c:out value="${user.admin}" /></td>
            <td><c:out value="${user.createdDate}" /></td>
            <td><a href="edit?id=${user.id}">Edit</a></td>
            <td><a href="delete?id=${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a href="add">Add user</a><bR/>
<a href="/">Main page</a><bR/>

<c:if test="${page != 1}">
<a href="?page=${page-1}&name=${name}">Previous</a>
</c:if>
<a href="?page=${page}&name=${name}"> ${page}</a>
<c:if test="${users.size() == 10}">
    <a href="?page=${page+1}&name=${name}"> Next</a>
</c:if>


</body>
</html>
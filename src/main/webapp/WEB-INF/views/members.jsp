<%--
  Created by IntelliJ IDEA.
  User: chois
  Date: 25. 7. 3.
  Time: 오후 3:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
  <thead> <th>id</th>
  <th>username</th>
  <th>age</th>
  </thead>
  <tbody>
  <c:forEach var="item" items="${members}">
    <tr>
      <td>${item.id}</td>
      <td>${item.username}</td>
      <td>${item.age}</td>
    </tr>
  </c:forEach>

  </tbody>
</table>
</body>
</html>

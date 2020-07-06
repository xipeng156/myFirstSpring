<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>第一个应用</title>
  </head>
  <body>
  <h1>hello idea</h1>
  <form action="list" method="post">
    username:<input type="text" name="username" value="${username}">
<%--    <input type="button" value="find">--%>
    <button type="submit">find</button>
  </form>


  <table border="1" cellpadding="5" cellspacing="0" width="90%">
    <tr>
      <td>编号</td>
      <td>姓名</td>
      <td>年龄</td>
      <td>性别</td>
      <td>用户名</td>
      <td>地址</td>
      <td>班级</td>
    </tr>
<c:forEach items="${aaa}" var="item">
    <tr>
      <td>${item.id}</td>
      <td>${item.name}</td>
      <td>${item.age}</td>
      <td>${item.sex}</td>
      <td>${item.username}</td>
      <td>${item.ardreess}</td>
      <td>${item.classid}</td>
    </tr>
</c:forEach>

  </table>
  </body>
</html>

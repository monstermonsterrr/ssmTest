<%--
  Created by IntelliJ IDEA.
  User: kgako
  Date: 2022/9/6
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link href="style/layui/css/layui.css" rel="stylesheet">
    <script src="style/layui/layui.js"></script>
    <title>index</title>
  </head>
  <body>
  <form method="post" action="${pageContext.request.contextPath}/hello">
    <input type="text" value="userName"  name="userName"><br>
    <input type="password" value="passWord" name="passWord">
    <button type="submit">submit</button>
  </form>
  </body>
</html>

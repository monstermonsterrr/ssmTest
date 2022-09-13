<%@ page import="java.util.List" %>
<%@ page import="com.kim.model.UserInfo" %><%--
  Created by IntelliJ IDEA.
  User: kgako
  Date: 2022/9/10
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>savePage</title>
</head>
<body>
success!
<%
UserInfo user = (UserInfo)request.getAttribute("user");
%>
<%=user.getUserName()%>
<%=user.getPassword()%>
</body>
</html>

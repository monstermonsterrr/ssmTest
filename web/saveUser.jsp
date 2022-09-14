<%@ page import="java.util.List" %>
<%@ page import="com.kim.model.userInfo" %><%--
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
List<userInfo> user = (List<userInfo>)request.getAttribute("userInfo");
%>
<%=user.get(0).getUsername()%>
<%=user.get(0).getPassword()%>
</body>
</html>

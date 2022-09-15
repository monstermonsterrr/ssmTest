<%--
  Created by IntelliJ IDEA.
  User: kgako
  Date: 2022/9/15
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    用户名：
    <input type="text" name="userName"><br>
    密码:
    <input type="password" name="passWord"><br>
    <button type="submit"  onclick="submit()">提交</button>
</form>
<script>
    function submit()
    {
        alert("hello");
    }
</script>
</body>
</html>

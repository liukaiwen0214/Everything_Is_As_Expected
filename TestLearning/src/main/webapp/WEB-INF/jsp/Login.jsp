<%--
  Created by IntelliJ IDEA.
  User: liukaiwen
  Date: 2024/7/11
  Time: 下午2:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/User/Login2">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="UserName"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="PassWord"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>
</body>
</html>


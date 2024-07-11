<%--
  Created by IntelliJ IDEA.
  User: liukaiwen
  Date: 2024/7/11
  Time: 下午2:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/User/Register">
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
                <input type="submit" value="注册">
            </td>
        </tr>
    </table>
</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./login.js"></script>
</head>
<body>
<center>
<h3>请填写用户信息</h3>
<!-- <form enctype="application/x-www-form-urlencoded"> -->
<form>
<table>
<tr>
    <td>用户名：</td>
    <td><input type="text" id="username"/>
        <input type="button" id="checkName" value="查看用户名"/><br>
        <div id="msg"></div>
    </td>
</tr>
<tr>
    <td>密码:</td>
    <td><input type="password"/></td>
</tr>
<tr>
   <td>确认密码：</td>
    <td><input type="password"/></td>
</tr>
<tr>
   <td>出生日期：</td>
   <td><input type="text"/><td>
</tr>

</table>
</form>
</center>
</body>
</html>
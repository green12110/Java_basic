<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入jquery -->
<script type="text/javascript" src="jquery/jquery-1.7.2.js"></script>
</head>
<body>
<input type="text" id="username" value="zhang"/>
 <script type="text/javascript">
	//获取jquery对象
	var $username = $("#username");
	
	//将jquery对象转成DOM对象  [index]和.get(index)
	//方法一：jQuery对象是一个数组对象，通过索引得到
	var usernameElement = $username[0];
	
	//方法二：jQuery本身提供，通过get()方法
	//var usernameElement = $username.get(0);
	
	
	alert("DOM: "+usernameElement.value);
	
	
</script>
</body>

</html>
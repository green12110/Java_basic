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
	//获取DOM对象
	var usernameElement = document.getElementById("username");
	//将DOM对象 转成 jquery对象  $(DOM对象) 
	var $username = $(usernameElement);
	
	alert("jquery:"+$username.val());
	
	
</script>
</body>

</html>
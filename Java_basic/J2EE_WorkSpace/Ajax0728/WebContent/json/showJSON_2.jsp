<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
   //json格式表示一个对象
   var people = {
		   "firstname":"Jack",
		   "lastname":"Ken",
		   "email":"jack1212@sohu.com",
		   "say":function() {
			   alert("Hello Json");
		   }
   }
   //访问people属性
   alert(people.firstname);
   //访问people方法
   people.say();
</script>
</body>
</html>
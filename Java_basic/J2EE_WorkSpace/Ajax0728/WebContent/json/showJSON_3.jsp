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
   //json格式表示数组
   var people = {
		   "paraml":
		   [
             {"firstname":"zhang1","lastname":"san1","email":"zhangsan1@sina,com"},
             {"firstname":"zhang2","lastname":"san2","email":"zhangsan2@sina,com"}
           ]
        }
   
   //访问people属性
   alert(people.paraml[1].firstname);
</script>
</body>
</html>
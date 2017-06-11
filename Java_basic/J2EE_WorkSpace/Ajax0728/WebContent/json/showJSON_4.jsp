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
		  "username":"zhang",
		  "sex":"mail",
		  "tel":{"phone":"115","ceil":"13511123333"},
		  "address":
			  [
			     {"city":"beijing","postcode":"112200"},
			     {"city":"dalian","postcode":"116011"}
			  
			  ]
        }
   
   //访问属性 username
   alert(people.username);
   //访问属性 ceil
   alert(people.tel.ceil);
   //访问第二个address的city
     alert(people.address[1].city);
</script>
</body>
</html>
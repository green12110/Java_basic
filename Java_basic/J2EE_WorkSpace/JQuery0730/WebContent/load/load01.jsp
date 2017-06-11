<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("Hello");
		System.out.println(request.getMethod());
		System.out.println("username= " + request.getParameter("username"));
		System.out.println("psw= " + request.getParameter("psw"));
	%>
	<h1>xxxxxxxxxxxxxxxxxxxxx</h1> 
	<h2>ppppppppppppppppppppp</h2> 
</body>
</html>
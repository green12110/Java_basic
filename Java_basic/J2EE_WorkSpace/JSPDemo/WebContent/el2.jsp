<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cn.entity.Person,cn.entity.Address"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL表达式</title>
</head>
<body>
<%
   Person per = new Person();
   per.setName("Jack");
   request.setAttribute("p1", per);
   
%>
<%--获取JavaBean属性 --%>
${p1.name}

<%
   Address add = new Address();
   add.setCity("大连");
   Person per2 = new Person();
   per2.setAddress(add);
   request.setAttribute("p2", per2);
%>
<%--获取JavaBean属性 --%>
${p2.address.city}

</body>
</html>
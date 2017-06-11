<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   request.setAttribute("data", "aaaaa");
   //通过pageContext得到隐式对象，方法 getRequest()
   //String value = (String)pageContext.getRequest().getAttribute("data");
   //通过pageContext访问其他域对象,方法getAttribut(arg0，arg1)
   String value = (String)pageContext.getAttribute("data", PageContext.REQUEST_SCOPE);
   
%>

<%=value %>

</body>
</html>
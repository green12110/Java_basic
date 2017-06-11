<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.itcast.cn" prefix="itcast" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--方式一：jsp脚本代码 --%>
<%-- <%

  String ip = request.getRemoteAddr();
  out.print(ip);
%> --%>
<br>
<%--方式二：得到远程访问的IP（el表达式） --%>
<%-- IP：${pageContext.request.remoteAddr} --%>
IP：<itcast:viewIP/>

</body>
</html>
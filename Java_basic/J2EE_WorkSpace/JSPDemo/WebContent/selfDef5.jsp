<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.itcast.cn" prefix="itcast" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改jsp页面的内容输出</title>
</head>
<body>
<%--BodyTag接口  常量EVAL_BODY_BUFFERD  
          返回此常量，服务器将把标签体作为对象，
          通过setBodyContext()方法传递给标签处理器类--%>
<itcast:UpperCase>
  <h3>aaaaaaa</h3>
</itcast:UpperCase>

</body>
</html>
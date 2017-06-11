<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,java.util.ArrayList,java.util.Map,java.util.HashMap" %>
<%@ page import="cn.entity.Person,cn.entity.Address"%>

<%--在web app library中找 standard.jar->meta-inf->c.tld --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl+el表达式完成 集合迭代</title>
</head>
<body>
<%
   List<String> listStr = new ArrayList<String>();
   listStr.add("aaa");
   listStr.add("bbb");
   listStr.add("ccc");
   request.setAttribute("listStr", listStr);
   
%>
<%--遍历List集合 --%>
<c:forEach items="${listStr}" var="list">
   ${list} <br>
</c:forEach>
<br>

<%
   List<Person> persons = new ArrayList<Person>();
   persons.add(new Person("张三"));
   persons.add(new Person("赵四"));
   persons.add(new Person("王小蒙"));
   request.setAttribute("ps", persons);
%>
<%--遍历List集合 --%>
<c:forEach items="${ps}" var="person">
  ${person.name}
  <br>
</c:forEach>

<%
  Map<String,String> map = new HashMap<String,String>();
  map.put("a", "aaaa");
  map.put("b", "bbbb");
  map.put("c", "cccc");
  map.put("22", "2222");
  
  request.setAttribute("map", map);  
%>
<%--遍历Map集合 --%>
<c:forEach items="${map}" var="entry">
  ${entry.key}---${entry.value}
  <br>
</c:forEach>

<%
  Map<String,Person> per = new HashMap<String,Person>();
  per.put("aa", new Person("Jack"));
  per.put("bb", new Person("Rose"));
  per.put("cc", new Person("Alex"));
  per.put("33", new Person("Lily"));
 
  
  request.setAttribute("per", per);  
%>
<%--遍历Map集合 --%> 
<c:forEach items="${per}" var="entry">
  ${entry.key}---${entry.value.name}
  <br>
</c:forEach>
<br>
获取项目名称：${pageContext.request.contextPath}<br>
<a href="${pageContext.request.contextPath}/index.jsp">请点我</a>


</body>
</html>
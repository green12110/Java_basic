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
		   "programmer":
		   [
             {"firstname":"zhang1","lastname":"san1","email":"zhangsan1@sina,com"},
             {"firstname":"zhang2","lastname":"san2","email":"zhangsan2@sina,com"}
           ],
           "authors":
           [
            {"firstname":"li1","lastname":"si1","email":"lisi1@sina,com"},
            {"firstname":"li2","lastname":"si2","email":"lisi2@sina,com"}
           ],
           "musicians":
           [
              {"firstname":"zhao1","lastname":"liu1","email":"zhaoliu1@sina,com"},
              {"firstname":"zhao2","lastname":"liu2","email":"zhaoliu2@sina,com"}
          ]
        }
   
   //访问people属性
   alert(people.authors[1].email);
   alert(people.musicians[1].firstname);
</script>
</body>
</html>
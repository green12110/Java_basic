<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <select id="province" name="province">
        <option value="">请选择....</option>
    </select><br>
	<input type="button" id="okBtn" value="ok" />
</body>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("okBtn").onclick = function() {
			//1 获取对象
			var xmlHttp = ajaxFunction();
			//2处理服务器响应数据
			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.readyState == 4) {
					if (xmlHttp.status == 200 || xmlHttp.status == 302) {
						//alert("xxxx");
						var data = xmlHttp.responseText;
						var dataObj = eval("("+data+")");
						for(var i=0;i<dataObj.length;i++){
						    var pName = dataObj[i].name;
						    
						    var proElements = document.createElement("option");
							var proText = document.createTextNode(pName);
							proElements.appendChild(proText);
							document.getElementById("province").appendChild(proElements);
						}
						
					}

				}

			}
			//3连接服务器
			var url = "../TestJsonServlet";
			xmlHttp.open("post", url, true);
			xmlHttp.setRequestHeader("Content-Type",
					"application/x-www-form-urlencoded");
			//4发送数据
			xmlHttp.send(null);
		}

	}

	function ajaxFunction() {
		var xmlHttp;
		try {
			//Firefox, Opera 8.0+, Safari浏览器
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			//Internet Explorer 浏览器
			try {
				xmlHttp = new ActiveXObject("Msxml2.XMLHTT");
			} catch (e) {
				try {
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
				}

			}

		}
		return xmlHttp;

	}
</script>
</html>
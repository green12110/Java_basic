window.onload = function() {
	
	document.getElementById("checkName").onclick = function() {
		var username = document.getElementById("username").value;
		//1 创建对象
		var xmlHttp = ajaxFunction();
		
		//4处理服务器的响应
		xmlHttp.onreadystatechange = function() {
			if(xmlHttp.readyState == 4){
				if(xmlHttp.status == 200 || xmlHttp.status == 304){
					//获取服务器响应的值
					var data = xmlHttp.responseText;
					//将获取的值赋给页面的msg元素
					document.getElementById("msg").innerHTML="<font color='red'>"+data+"</font>";
					//alert(data);
				}
				
			}
		}
		
		//2打开和服务器的连接
		var url="../UserLoginServlet";
		xmlHttp.open("post",url,true);
		   //2.1如果为post传递时，要设置setRequestHeader()
		xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		
		//3发送数据
		xmlHttp.send("username="+username);
		

		
	}
	
	
}

/**
 * 创建XMLHttpRequest对象
 */
function ajaxFunction() {
	var xmlHttp;
	try{
		// Firefox, Opera 8.0+, Safari浏览器
		xmlHttp = new XMLHttpRequest();
		
	}catch(e){
		try{
			// Internet Explorer 浏览器
			xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			
		}catch(e){
			try{
				xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
			}catch(e){}
		}
	}
	return xmlHttp;
	
	
}
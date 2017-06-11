window.onload = function() {
	    //1创建XMLHttpRequest对象
		var xmlHTTP = ajaxFunction();
		
		//4处理服务器响应
		xmlHTTP.onreadystatechange = function() {
			if(xmlHTTP.readyState == 4){
				if(xmlHTTP.status == 200 || xmlHTTP.status == 302){
					//如果服务器返回的是 XML， 那么数据将储存在 responseXML属性中
					var xmlDoc = xmlHTTP.responseXML;
					//获取tag名字为province的元素
					var xmlProElements = xmlDoc.getElementsByTagName("province");
					//alert(xmlProElements.length);
					//遍历province
					for(var i=0;i<xmlProElements.length;i++){
						//获取province的name属性
						var xmlProName = xmlProElements[i].getAttribute("name");
						alert(xmlProName);
						//创建option元素
						var optionElement = document.createElement("option");
						optionElement.setAttribute("name",xmlProName);
						//创建文本元素
						var optionTextElement = document.createTextNode(xmlProName);
						//插入子节点
						optionElement.appendChild(optionTextElement);
						
						document.getElementById("province").appendChild(optionElement);
					}
					
				}
				
			}
			
		}
		
		//2连接服务器
		var url="../XmlFileServlet";
		xmlHTTP.open("post",url,true);
		xmlHTTP.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		//3发送数据
		xmlHTTP.send(null);
		
		
	
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

	


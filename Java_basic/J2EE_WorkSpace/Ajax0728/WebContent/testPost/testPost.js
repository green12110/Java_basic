/*
 * AJAX建立和服务器的连接，接收服务器的请求，处理服务器返回的数据
 * 开发步骤：
 *   1、创建XMLHttpRequest对象
 *   2、打开和服务器的连接
 *      xmlHttp.open("get","../testServlet",true);
		  参数1: 请求方法  get post
		  参数2:请求的路径
		  参数3:表示请求是否要异步传输，默认值为true(异步)
 *   3、发送数据
 *       * 如果请求方法是get,此时send方法不能发送数据到服务器端
		 *     即使发送了数据,服务器端也接收不到,该参数设置null
		 *     此时传递参数可以使用url方式传递参数 
 *   4、处理服务器的响应
 *        * 怎接收?
		  *   * 什么时候接收呢? 
		  *   * onreadystatechange事件处理函数由服务器触发，而不是用户
              * 在 Ajax 执行过程中，服务器会通知客户端当前的通信状态。通信状态的改变要激发函数的执行
              * XMLHttpRequest对象的readyState属性
              * 每次 readyState属性值的改变都会触发 readystatechange事件
              * readyState 属性表示Ajax请求的当前状态。它的值用数字代表。
					0 代表未初始化。 还没有调用 open 方法
					1 代表正在加载。 open 方法已被调用，但 send 方法还没有被调用
					2 代表已加载完毕。send 已被调用。请求已经开始
					3 代表交互中。服务器正在发送响应
					4 代表完成。响应发送完毕
 *   
 * 
 * 
 * 
 */


window.onload = function(){
	//<input type="button"  id="ok" value="测试连接服务器"/>
	document.getElementById("ok").onclick = function() {
		//1 创建XmlHttpRequest对象
		var xmlHttp = ajaxFunction();
		
		//4处理服务器的响应
		xmlHttp.onreadystatechange = function() {
			//alert(xmlHttp.readyState);
			//alert(xmlHttp.status);
			//响应发送完毕
			if(xmlHttp.readyState == 4){
				if(xmlHttp.status == 200 || xmlHttp.status == 304){
					var data = xmlHttp.responseText;
					alert(data);
				}
			}
		}
				
		//2打开和服务器的连接
		var url = "../TestGetServlet?a="+10;
		xmlHttp.open("post",url,true);
		/*
		 * 如果请求方法是post,需要设置Content-Type的类型
		 *  * 该方法必须放置在open方法的后面
		 */   
		xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		
		//3发送数据,post方式可接收到send的值
		xmlHttp.send("b=101&c=202");
		//xmlHttp.send(null);
	}
}

/**
 * 创建XMLHttpRequest对象
 */
function ajaxFunction(){
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
		   }catch(e){ }
	    }
	}
	
	return xmlHttp;
}
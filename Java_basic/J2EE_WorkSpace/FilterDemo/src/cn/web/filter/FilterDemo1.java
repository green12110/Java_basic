package cn.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/*
 * filter的三种典型应用：
 * 1、可以在filter中根据条件决定是否调用chain.doFilter(request, response)方法，即是否让目标资源执行
 * 2、在让目标资源执行之前，可以对request\response作预处理，再让目标资源执行
 * 3、在目标资源执行之后，可以捕获目标资源的执行结果，从而实现一些特殊的功能
 * 
 */

public class FilterDemo1 implements Filter {

    public FilterDemo1() {
    	System.out.println("filter1构造");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("filter1销毁");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//可以对request\response作预处理，再让目标资源执行
		//例如：写好一个过滤器，解决全站的乱码问题
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		System.out.println("filter1工作");
		//chain.doFilter()先检查链里面是否有下一个filter，如果有，让下一个filter执行
		//如果没有，则让目标资源文件执行
		chain.doFilter(request, response);//让目标资源执行，放行
		System.out.println("filter1工作结束");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter1初始化");
	}

}

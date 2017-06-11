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
 * filter�����ֵ���Ӧ�ã�
 * 1��������filter�и������������Ƿ����chain.doFilter(request, response)���������Ƿ���Ŀ����Դִ��
 * 2������Ŀ����Դִ��֮ǰ�����Զ�request\response��Ԥ��������Ŀ����Դִ��
 * 3����Ŀ����Դִ��֮�󣬿��Բ���Ŀ����Դ��ִ�н�����Ӷ�ʵ��һЩ����Ĺ���
 * 
 */

public class FilterDemo1 implements Filter {

    public FilterDemo1() {
    	System.out.println("filter1����");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("filter1����");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//���Զ�request\response��Ԥ��������Ŀ����Դִ��
		//���磺д��һ�������������ȫվ����������
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		System.out.println("filter1����");
		//chain.doFilter()�ȼ���������Ƿ�����һ��filter������У�����һ��filterִ��
		//���û�У�����Ŀ����Դ�ļ�ִ��
		chain.doFilter(request, response);//��Ŀ����Դִ�У�����
		System.out.println("filter1��������");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter1��ʼ��");
	}

}

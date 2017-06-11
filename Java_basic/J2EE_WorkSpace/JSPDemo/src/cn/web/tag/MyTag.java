package cn.web.tag;

import java.io.IOException;

import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport {

    /**
     * 在开始标签是调用此方法
     */
	@Override
	public int doStartTag() throws JspException {
        //web容易调用setPageContext（）方法，把页面的pageContext传给了标签处理器类
		//因此在此类中，可以通过pageContext获取request对象
		HttpServletRequest request = (HttpServletRequest) this.pageContext
				.getRequest();
		//通过pageContext获取out对象
		JspWriter out = this.pageContext.getOut();
		//通过request对象获取远程访问计算机的IP地址
		String ip = request.getRemoteAddr();
		//向JSP页面输出ip地址
		try {
			out.print(ip);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return super.doStartTag();
	}

}

package cn.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;

public class UpperCaseTag extends BodyTagSupport{
	
	@Override
	public int doStartTag() throws JspException {
		//返回此常量,服务器会把标签体封装到一个对象中
		//调用setBodyContent()将标签体传给标签处理器类
		return BodyTag.EVAL_BODY_BUFFERED;
	}

	@Override
	public int doEndTag() throws JspException {
		//得到标签体
		BodyContent content = this.getBodyContent();
		//得到标签体的字符串，然后转换成大写
		String cc = content.getString().toUpperCase();
		//将cc输出到JSP页面
		JspWriter out = this.pageContext.getOut();
		try {
			out.print(cc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		return Tag.EVAL_PAGE;
	}
	
	
    

}

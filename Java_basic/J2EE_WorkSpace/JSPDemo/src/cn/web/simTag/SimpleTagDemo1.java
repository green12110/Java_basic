package cn.web.simTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo1 extends SimpleTagSupport{
	
	@Override
	/**
	 * 执行标签时，则调用此方法，
	 * 如果方法体为空，则不执行标签体
	 */
	public void doTag() throws JspException, IOException {
		//得到标签体对象JspFragment
		JspFragment jf = this.getJspBody();
		//this.getJspContext() 得到代表Jsp页面的pageContext对象
		JspWriter out = this.getJspContext().getOut();
		//执行标签体对象jf
		jf.invoke(out);
	}

}

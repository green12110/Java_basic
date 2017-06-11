package cn.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class OutPage extends TagSupport {
	@Override
	/**
	 * 在结束标签时调用此方法
	 */
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		//计算整个JSP页面
		//return Tag.EVAL_PAGE;
		//跳过整个页面
		return Tag.SKIP_PAGE;
	}
}

package cn.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class OutputTag extends TagSupport{
	/**
	 * 在开始标签的时候调用
	 */
	@Override
	public int doStartTag() throws JspException {
		//计算JSP页面其余的部分
		//return Tag.EVAL_BODY_INCLUDE;
		//跳过（不计算）JSP页面其余的部分
		return Tag.SKIP_BODY;
	}
	
	

}

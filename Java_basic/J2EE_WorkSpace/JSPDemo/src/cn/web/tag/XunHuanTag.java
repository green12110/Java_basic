package cn.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class XunHuanTag extends TagSupport {
	private int x = 5; // 控制循环次数，5次

	/**
	 * 在开始标签的时候调用
	 */
	@Override
	public int doStartTag() throws JspException {

		return Tag.EVAL_BODY_INCLUDE;
		// return Tag.SKIP_BODY;
	}

	/**
	 * 在标签体结束之后，标签结束之前调用
	 */
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		x--;
		if (x > 0) {
			// 请求重新评价标签体Request the reevaluation of some body.
			return IterationTag.EVAL_BODY_AGAIN;
		} else {
			return Tag.SKIP_BODY;
		}
	}

}

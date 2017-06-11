package cn.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class XunHuanTag extends TagSupport {
	private int x = 5; // ����ѭ��������5��

	/**
	 * �ڿ�ʼ��ǩ��ʱ�����
	 */
	@Override
	public int doStartTag() throws JspException {

		return Tag.EVAL_BODY_INCLUDE;
		// return Tag.SKIP_BODY;
	}

	/**
	 * �ڱ�ǩ�����֮�󣬱�ǩ����֮ǰ����
	 */
	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		x--;
		if (x > 0) {
			// �����������۱�ǩ��Request the reevaluation of some body.
			return IterationTag.EVAL_BODY_AGAIN;
		} else {
			return Tag.SKIP_BODY;
		}
	}

}

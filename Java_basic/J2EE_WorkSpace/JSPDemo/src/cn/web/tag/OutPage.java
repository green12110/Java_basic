package cn.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class OutPage extends TagSupport {
	@Override
	/**
	 * �ڽ�����ǩʱ���ô˷���
	 */
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		//��������JSPҳ��
		//return Tag.EVAL_PAGE;
		//��������ҳ��
		return Tag.SKIP_PAGE;
	}
}

package cn.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class OutputTag extends TagSupport{
	/**
	 * �ڿ�ʼ��ǩ��ʱ�����
	 */
	@Override
	public int doStartTag() throws JspException {
		//����JSPҳ������Ĳ���
		//return Tag.EVAL_BODY_INCLUDE;
		//�����������㣩JSPҳ������Ĳ���
		return Tag.SKIP_BODY;
	}
	
	

}

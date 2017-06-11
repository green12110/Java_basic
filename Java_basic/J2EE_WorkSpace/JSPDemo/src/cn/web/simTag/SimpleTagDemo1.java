package cn.web.simTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo1 extends SimpleTagSupport{
	
	@Override
	/**
	 * ִ�б�ǩʱ������ô˷�����
	 * ���������Ϊ�գ���ִ�б�ǩ��
	 */
	public void doTag() throws JspException, IOException {
		//�õ���ǩ�����JspFragment
		JspFragment jf = this.getJspBody();
		//this.getJspContext() �õ�����Jspҳ���pageContext����
		JspWriter out = this.getJspContext().getOut();
		//ִ�б�ǩ�����jf
		jf.invoke(out);
	}

}

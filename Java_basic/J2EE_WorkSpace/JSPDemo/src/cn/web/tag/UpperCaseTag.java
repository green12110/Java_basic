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
		//���ش˳���,��������ѱ�ǩ���װ��һ��������
		//����setBodyContent()����ǩ�崫����ǩ��������
		return BodyTag.EVAL_BODY_BUFFERED;
	}

	@Override
	public int doEndTag() throws JspException {
		//�õ���ǩ��
		BodyContent content = this.getBodyContent();
		//�õ���ǩ����ַ�����Ȼ��ת���ɴ�д
		String cc = content.getString().toUpperCase();
		//��cc�����JSPҳ��
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

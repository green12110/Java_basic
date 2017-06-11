package cn.web.tag;

import java.io.IOException;

import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport {

    /**
     * �ڿ�ʼ��ǩ�ǵ��ô˷���
     */
	@Override
	public int doStartTag() throws JspException {
        //web���׵���setPageContext������������ҳ���pageContext�����˱�ǩ��������
		//����ڴ����У�����ͨ��pageContext��ȡrequest����
		HttpServletRequest request = (HttpServletRequest) this.pageContext
				.getRequest();
		//ͨ��pageContext��ȡout����
		JspWriter out = this.pageContext.getOut();
		//ͨ��request�����ȡԶ�̷��ʼ������IP��ַ
		String ip = request.getRemoteAddr();
		//��JSPҳ�����ip��ַ
		try {
			out.print(ip);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return super.doStartTag();
	}

}

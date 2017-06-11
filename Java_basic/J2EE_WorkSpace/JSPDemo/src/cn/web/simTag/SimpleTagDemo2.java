package cn.web.simTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//控制标签体执行10次
public class SimpleTagDemo2 extends SimpleTagSupport{
	
	@Override
	public void doTag() throws JspException, IOException {
		//得到标签体对象JspFragment
		JspFragment jf = this.getJspBody();
		JspWriter out = this.getJspContext().getOut();
		
		//执行10次
		for(int i=0;i<10;i++){
			jf.invoke(out);
			
		}
	}

}

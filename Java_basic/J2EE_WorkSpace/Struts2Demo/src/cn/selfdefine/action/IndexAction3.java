package cn.selfdefine.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction3 extends ActionSupport{
	
    
	@Override
	public String execute() throws Exception {
		ActionContext.getContext();
		return "success";
	}

}

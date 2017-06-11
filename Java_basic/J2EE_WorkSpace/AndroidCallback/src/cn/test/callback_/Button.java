package cn.test.callback_;

public class Button {
	
	// 事件接口
	private OnClickListener mOnClickListener;
	
	
	// 成语变量set方法
    public void setOnClickListener(OnClickListener l){
    	this.mOnClickListener = l;
    }
    
    
    public void performClick(){
    	//回调mOnClickListener的方法
    	mOnClickListener.click();
    }

}

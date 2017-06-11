package cn.test.callback_;

public class Button {
	
	// �¼��ӿ�
	private OnClickListener mOnClickListener;
	
	
	// �������set����
    public void setOnClickListener(OnClickListener l){
    	this.mOnClickListener = l;
    }
    
    
    public void performClick(){
    	//�ص�mOnClickListener�ķ���
    	mOnClickListener.click();
    }

}

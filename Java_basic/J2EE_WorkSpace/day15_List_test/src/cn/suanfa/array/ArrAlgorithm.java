package cn.suanfa.array;

public class ArrAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,22,33,44,55};
		outputArray(arr);
		System.out.println("");
		
		//��33���Ԫ�صĺ��棬���һ��Ԫ��88
		int[] b = insertElement(arr,88);
		outputArray(b);

	}
	
	public static void outputArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static int[] insertElement(int[] arr,int element){
		int[] b = new int[arr.length+1];
		//�ҵ�33���Ԫ��������arr�е�index
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 33){
				index = i;
				break;
			}
		}
		
		//Ϊ����b��ֵ,�������������
		for(int i=0;i<b.length;i++){
			if(i<=index){
				b[i]=arr[i];
			}else if(i==(index+1)){
				b[i] = 88;
			}else{
				b[i]=arr[i-1];
			}
			
		}
		
		return b;
		
	} 

}

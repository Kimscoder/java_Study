package javaQ4_sol;

public class TriangleVO {
	
	public int height;
	public int baseLine; //����� �ʱ�ȭ
	
//	{
//		//System.out.println("��� �ʱ�ȭ ����");
//		int temp = (int)(Math.random()*11);
//		if(temp%2==0) {
//			height = (baseLine=0);
//		}else{
//			height = (baseLine = 1);
//		}
//		//System.out.println("��� �ʱ�ȭ ����");
//	}
	
	public TriangleVO() {
		
	}
	public TriangleVO(int height, int baseLine){
		this.height = height;
		this.baseLine = baseLine;
	}
	
	public int surface() {
		return (int)(height*baseLine*0.5f);
	}
//	{
//		height = 1;
//		baseLine =1;
//	}//�� �ʱ�ȭ
//	
//	public TriangleVO() {
//		height =1;
//		baseLine =1;
//	}
//	
//	public TriangleVO(int height, int baseLine) {
//		this.height = height;
//		this.baseLine = baseLine;
//	}//������ �ʱ�ȭ
}

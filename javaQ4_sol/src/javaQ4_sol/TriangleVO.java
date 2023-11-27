package javaQ4_sol;

public class TriangleVO {
	
	public int height;
	public int baseLine; //명시적 초기화
	
//	{
//		//System.out.println("블록 초기화 시작");
//		int temp = (int)(Math.random()*11);
//		if(temp%2==0) {
//			height = (baseLine=0);
//		}else{
//			height = (baseLine = 1);
//		}
//		//System.out.println("블록 초기화 종료");
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
//	}//블럭 초기화
//	
//	public TriangleVO() {
//		height =1;
//		baseLine =1;
//	}
//	
//	public TriangleVO(int height, int baseLine) {
//		this.height = height;
//		this.baseLine = baseLine;
//	}//생성자 초기화
}

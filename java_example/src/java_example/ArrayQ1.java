package java_example;
//타입이 다를경우
public class ArrayQ1 {

	public static void main(String[] args) {
		String[] subject = {"순번","이름","국어","영어","수학","과학","총점","평균"};
		String[] name = {"이민호","이상재","나재갈","탁재훈"};
		int[] kor = {71,81,91,61};//바로 배열에 넣어주는 방법
		int[] eng = {72,82,92,62};
		int[] math = {73,83,93,63};
		int[] scien = {74,84,94,64};		
		int[] total =new int[4];
		float[] evg =new float[4];
		
		for(int stuNum=0;stuNum<4;stuNum++) {	
			total[stuNum] =kor[stuNum]+eng[stuNum]+math[stuNum]+scien[stuNum];
			evg[stuNum] =(int)((total[stuNum]/4f)*100+0.5)/100f;
		}
		
		//출력
		for(int i=0; i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		
		System.out.println();
		
		for(int stuNum=0; stuNum<4; stuNum++) {
	
			System.out.println(stuNum+"\t"+name[stuNum]+"\t"+kor[stuNum]+"\t"+eng[stuNum]
								+"\t"+math[stuNum]+"\t"+scien[stuNum]+"\t"
								+total[stuNum]+"\t"+evg[stuNum]+"\t");
		}
	}

}

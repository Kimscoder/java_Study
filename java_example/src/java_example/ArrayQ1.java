package java_example;
//Ÿ���� �ٸ����
public class ArrayQ1 {

	public static void main(String[] args) {
		String[] subject = {"����","�̸�","����","����","����","����","����","���"};
		String[] name = {"�̹�ȣ","�̻���","���簥","Ź����"};
		int[] kor = {71,81,91,61};//�ٷ� �迭�� �־��ִ� ���
		int[] eng = {72,82,92,62};
		int[] math = {73,83,93,63};
		int[] scien = {74,84,94,64};		
		int[] total =new int[4];
		float[] evg =new float[4];
		
		for(int stuNum=0;stuNum<4;stuNum++) {	
			total[stuNum] =kor[stuNum]+eng[stuNum]+math[stuNum]+scien[stuNum];
			evg[stuNum] =(int)((total[stuNum]/4f)*100+0.5)/100f;
		}
		
		//���
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

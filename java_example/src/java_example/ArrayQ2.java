package java_example;

import java.util.Scanner;

public class ArrayQ2 {

	public static void main(String[] args) {
		//�л����� �Է¹ް� �� �л��� ��ŭ ����, ����, ����, ���� ������ �Է¹޾� ������ ����� ��Ÿ���� ���α׷��� �ۼ��Ͻÿ�.
		Scanner scann = new Scanner(System.in);
		String[] label = {"����","�̸�","����","����","����","����","����","���"};
		final int stuNum;//final�� ������ �ѹ� �����ϸ� ���ٲ�
		
		System.out.print("�л� �� : ");
		stuNum = scann.nextInt();scann.nextLine();
		
		String[] name = new String[stuNum];
		int[] kor = new int[stuNum];//�ٷ� �迭�� �־��ִ� ���
		int[] eng = new int[stuNum];
		int[] math = new int[stuNum];
		int[] scien = new int[stuNum];		
		int[] total = new int[stuNum];
		float[] evg =new float[stuNum];
		
		for(int i=0;i<stuNum;i++) {
			System.out.println("�л�"+(i+1)+"���� �Է����ּ���.");
			System.out.print("�̸� : ");
			name[i] = scann.nextLine();
			System.out.print("���� : ");
			kor[i] = scann.nextInt();scann.nextLine();
			System.out.print("���� : ");
			eng[i] = scann.nextInt();scann.nextLine();
			System.out.print("���� : ");
			math[i] = scann.nextInt();scann.nextLine();
			System.out.print("���� : ");
			scien[i]= scann.nextInt();scann.nextLine();
			System.out.println();
			
			total[i] =kor[i]+eng[i]+math[i]+scien[i];
			evg[i] =(int)((total[i]/4f)*100+0.5)/100f;
		}
		System.out.println("���� �Է��� ���ƽ��ϴ�.");
		for(int i =0; i<label.length; i++) {
			System.out.print(label[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<stuNum; i++) {
			
			System.out.println(i+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]
								+"\t"+math[i]+"\t"+scien[i]+"\t"
								+total[i]+"\t"+evg[i]+"\t");
		}
		
		
		

	}

}

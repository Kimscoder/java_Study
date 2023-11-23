package java_example;

import java.util.Scanner;

public class ArrayQ2 {

	public static void main(String[] args) {
		//학생수를 입력받고 그 학생수 만큼 국어, 수학, 영어, 과학 점수를 입력받아 총점과 평균을 나타내는 프로그램을 작성하시오.
		Scanner scann = new Scanner(System.in);
		String[] label = {"순번","이름","국어","영어","수학","과학","총점","평균"};
		final int stuNum;//final이 붙으면 한번 지정하면 못바꿈
		
		System.out.print("학생 수 : ");
		stuNum = scann.nextInt();scann.nextLine();
		
		String[] name = new String[stuNum];
		int[] kor = new int[stuNum];//바로 배열에 넣어주는 방법
		int[] eng = new int[stuNum];
		int[] math = new int[stuNum];
		int[] scien = new int[stuNum];		
		int[] total = new int[stuNum];
		float[] evg =new float[stuNum];
		
		for(int i=0;i<stuNum;i++) {
			System.out.println("학생"+(i+1)+"정보 입력해주세요.");
			System.out.print("이름 : ");
			name[i] = scann.nextLine();
			System.out.print("국어 : ");
			kor[i] = scann.nextInt();scann.nextLine();
			System.out.print("영어 : ");
			eng[i] = scann.nextInt();scann.nextLine();
			System.out.print("수학 : ");
			math[i] = scann.nextInt();scann.nextLine();
			System.out.print("과학 : ");
			scien[i]= scann.nextInt();scann.nextLine();
			System.out.println();
			
			total[i] =kor[i]+eng[i]+math[i]+scien[i];
			evg[i] =(int)((total[i]/4f)*100+0.5)/100f;
		}
		System.out.println("정보 입력을 마쳤습니다.");
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

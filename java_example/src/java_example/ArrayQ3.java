package java_example;

import java.util.Scanner;

public class ArrayQ3 {

	public static void main(String[] args) {
		// 2번 문제에서 2차원 배열로 다시 설계
		final int STUDEN_NUM;
		final int SUBJECT_NUM;
		
		Scanner scann = new Scanner(System.in);
		
		String[] name;
		String[] subject;
		int[][] score;
		int[] total;
		float[] evg;
		
		System.out.print("학생 수 : ");
		STUDEN_NUM = scann.nextInt();scann.nextLine();
		
		System.out.print("과목 수 :");
		SUBJECT_NUM = scann.nextInt();scann.nextLine();
		
		name = new String[STUDEN_NUM];
		subject = new String[SUBJECT_NUM];
		score = new int[STUDEN_NUM][SUBJECT_NUM];
		total = new int[STUDEN_NUM];
		evg = new float[STUDEN_NUM];
		
		//과목명 입력
		for(int i =0; i<SUBJECT_NUM;i++) {
			System.out.print((i+1)+"/"+SUBJECT_NUM+"번째 과목명 : ");
			subject[i] = scann.nextLine();
		}
		
		//이름,점수 입력
		for(int i =0; i<STUDEN_NUM; i++) {
			System.out.println((i+1)+"/"+STUDEN_NUM+" 번째 학생 정보 입력");
			System.out.print(" 이름 : ");
			name[i] = scann.nextLine();
			
			for(int j =0; j<SUBJECT_NUM;j++) {
				System.out.print((i+1)+"번의 학생의"+subject[j]+" 과목 점수 : ");
				score[i][j] = scann.nextInt();scann.nextLine();
			}
			System.out.println();
			
		}
		
		//처리
		for(int i = 0; i<STUDEN_NUM; i++) {
			for(int j = 0; j<SUBJECT_NUM; j++) {
				total[i] = total[i]+ score[i][j]; 
			}
			evg[i] = (int)(total[0]/(float)SUBJECT_NUM*100+0.5f)/100f;
		}
		
		//출력
		//라벨
		System.out.print("순번\t이름\t");
		for(int j =0; j<SUBJECT_NUM; j++) {
			System.out.print(subject[j]+"\t");
		}
		System.out.print("총점\t평균");
		System.out.println();
		
		//학생정보
		for(int i =0; i<STUDEN_NUM; i++) {
			System.out.print((i+1)+"\t"+name[i]+"\t");
			for(int j =0; j<SUBJECT_NUM; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(total[i]+"\t"+evg[i]);
		}
		System.out.println();
	}
}

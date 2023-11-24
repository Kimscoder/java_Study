package java_example;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// 로또 프로그램 작성(1~45)
		// 실행) 금액을 입력 : 3200
		// 34 23 22 21 11 2
		// 43 12 11 19 18 7
		// 7 2 12 16 4 5 1
		// 거스름돈 : 200
		Scanner scann = new Scanner(System.in);
		int count =0;
		int money =0;
		int odd =0;
		int Num =0;
		int[][] alpha;
		
		
		System.out.print("금액을 입력 : ");
		money = scann.nextInt();
		
		count = money/1000;
		odd = money%1000;
		alpha = new int[count][6];
		
		//로또 뽑기
		for(int i =0; i<count; i++) {
			for(int j =0; j<6; j++) {
				Num = (int)(Math.random()*45+1);
				alpha[i][j] = Num;
				System.out.print(alpha[i][j]+" ");
				for(int k=0; k<6; k++) {
					if((alpha[i][j] == alpha[i][k])&&j>0) {
						j--;
						break;
					}
				}
				
			}
			
		}
		//출력
		for(int i =0; i<count; i++) {
			for(int j =0; j<6; j++) {
				System.out.print(alpha[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("거스름 돈 : "+odd);
	}

}

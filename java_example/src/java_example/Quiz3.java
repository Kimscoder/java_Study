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
		int[] alpha = new int[6];
		
		System.out.print("금액을 입력 : ");
		money = scann.nextInt();
		
		count = money/1000;
		odd = money%1000;
		
		for(int i =0; i<count; i++) {
			for(int j =0; j<6; j++) {
				alpha[j] = (int)(Math.random()*45+1);
				System.out.print(alpha[j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("거스름 돈 : "+odd);
	}

}

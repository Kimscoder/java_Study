package java_example;

import java.util.Scanner;

public class Q3_sol {

	public static void main(String[] args) {
		Scanner scann= new Scanner(System.in);
		
		final int PRICE_PER_LOTTO = 1000;
		
		int money ;//투입금액
		int lottoCnt;//로또횟수
		int changeMoney;//거스름돈
		int[] cardDeck =new int[45];
		int[][] output_num;
		
		//입력
		System.out.print("금액을 입력 :");
		money = scann.nextInt();scann.nextLine();
		lottoCnt = money / PRICE_PER_LOTTO;
		changeMoney = money % PRICE_PER_LOTTO; 
		output_num = new int[lottoCnt][6];
		
		//처리
		for(int i=0; i<45; i++) {
			cardDeck[i] =i+1;
			//덱 구성 1~45;
		}
		for(int count =0; count<lottoCnt; count++) {
			int temp =0;
			for(int i =0; i<45*100;i++) {
				int tempIndex = (int)(Math.random()*45); 
				temp = cardDeck[0];
				cardDeck[0] = cardDeck[tempIndex];
				cardDeck[tempIndex] = temp;
			}//셔플
			for(int i =0; i<6; i++) {
				output_num[count][i] = cardDeck[i]; 
			}//횟수순서에 따른 번호배열 할당
		}
		//출력
		for(int i = 0; i<output_num.length;i++) {
			for(int j=0; j< output_num[i].length; j++) {
				System.out.print(output_num[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("거스름 돈 : ￦"
				+changeMoney);
	}
}

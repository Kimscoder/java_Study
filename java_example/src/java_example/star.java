package java_example;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int num=0;
		String star="";
		
		System.out.print("정수 입력 : ");
		num = scann.nextInt();
		
		for(int i=0; i<num;i++) {
			star = star+"*";
		}
		
		System.out.print(star);
	}

}

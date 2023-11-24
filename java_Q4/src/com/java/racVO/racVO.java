package com.java.racVO;

import java.util.Scanner;

public class racVO {
	public int garo;
	public int sero;
	
	public float sol() {
		return (garo*sero);
	}
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.print("가로 입력 : ");
		garo = scann.nextInt();scann.nextLine();
		
		System.out.print("세로 입력 : ");
		sero = scann.nextInt();scann.nextLine();
		
		System.out.println();
	}
	
	public void printout() {
		System.out.println("사각형의 넓이 : "+sol());
	}
}

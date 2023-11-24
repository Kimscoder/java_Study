package com.java.cirVO;

import java.util.Scanner;

public class cirVO {
	public int r;
	public double pi = Math.PI;
	
	public float sol() {
		return (int)((float)(r*r*pi)*100+0.5)/100f;
	}
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		r = scann.nextInt();scann.nextLine();
	}
	
	public void printout() {
		System.out.println("삼각형의 넓이 : "+sol());
	}
}

package com.java.triVO;

import java.util.Scanner;

public class TriVO {
	
	public int stick;
	public int height;
	public float sol() {
		return (int)(((stick*height)/2f)*100+0.5)/100f;
	}
	
	public void input(){
		Scanner scann = new Scanner(System.in);
		System.out.print("밑변의 길이를 입력 : ");
		stick = scann.nextInt();scann.nextLine();
		
		System.out.print("높이 입력 : ");
		height = scann.nextInt();scann.nextLine();
		
		System.out.println();
	}
	
	public void printout() {
		System.out.println("삼각형 넓이 : "+sol());
	}
}

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
		System.out.print("���� �Է� : ");
		garo = scann.nextInt();scann.nextLine();
		
		System.out.print("���� �Է� : ");
		sero = scann.nextInt();scann.nextLine();
		
		System.out.println();
	}
	
	public void printout() {
		System.out.println("�簢���� ���� : "+sol());
	}
}

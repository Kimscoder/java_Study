package com.java.dto;

import java.util.Scanner;

//package�� �ٸ��� �տ� ������ �������
public class ScoreVO {
	//class Field�� �ִ� �������� �˾Ƽ� �ʱ�ȭ��
	//instance member - static X
    public String name;
    public int math;
    public int kor;
    public int eng;
    public int scien;
    
    public int total() {
    	return kor+eng+math+scien;
    }
    public float evg() {
    	return ((int)(total()/4f*100+0.5))/100f;
    }
    //void�� return type�� ������,���
    public void input() {
    	Scanner scann = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = scann.nextLine();
		
		System.out.print("���� : ");
		kor = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : ");
		eng = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : ");
		math = scann.nextInt();scann.nextLine();
		
		System.out.print("���� : "); 
		scien = scann.nextInt();scann.nextLine();
		
		System.out.println();
    }
    //static�� �ٿ��� Class member
    public static void printLabel() {
    	System.out.println("�̸�\t����\t����\t����\t����\t����\t���");
    }
    public void printScore() {
    	System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+scien+"\t"+total()
							+"\t"+evg());
    }
}

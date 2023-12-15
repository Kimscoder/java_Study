package com.java.dto;

import java.util.Scanner;

//package�� �ٸ��� �տ� ������ �������
public class ScoreVO implements Comparable<ScoreVO>{
	//class Field�� �ִ� �������� �˾Ƽ� �ʱ�ȭ��
	//instance member - static X
    private String name;
    private int math;
    private int kor;
    private int eng;
    private int scien;
    
    
    public String getName() {
		return name;
	}
	public int getMath() {
		return math;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getScien() {
		return scien;
	}
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

	public int compareTo(Object o) {
		if( !(o instanceof ScoreVO)) return -1;
		
		ScoreVO other = (ScoreVO)o;
		return this.name.compareTo(other.getName());
	}
	//String�� Comparable�ϱ� ������ ���Ҷ��� ���� ���� �������ص� ��
}
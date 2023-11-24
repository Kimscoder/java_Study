package com.java.dto;

import java.util.Scanner;

//package가 다르면 앞에 설정을 해줘야함
public class ScoreVO {
	//class Field에 있는 변수들은 알아서 초기화됨
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
    //void는 return type이 없을때,사용
    public void input() {
    	Scanner scann = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = scann.nextLine();
		
		System.out.print("국어 : ");
		kor = scann.nextInt();scann.nextLine();
		
		System.out.print("영어 : ");
		eng = scann.nextInt();scann.nextLine();
		
		System.out.print("수학 : ");
		math = scann.nextInt();scann.nextLine();
		
		System.out.print("과학 : "); 
		scien = scann.nextInt();scann.nextLine();
		
		System.out.println();
    }
    //static을 붙여서 Class member
    public static void printLabel() {
    	System.out.println("이름\t국어\t영어\t수학\t과학\t총점\t평균");
    }
    public void printScore() {
    	System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+scien+"\t"+total()
							+"\t"+evg());
    }
}

package com.java.main;

import com.java.dto.ScoreVO;//ctrl+shift+O

public class ScoreMain {

	public static void main(String[] args) {
		ScoreVO s =new ScoreVO();//com.java.dto.<< package ���� Class�տ� �ٿ������
		s.kor =98;
		s.math = 90;
		s.eng = 87;
		s.scien = 78;
		
		System.out.println("���� : "+s.total());
		System.out.println("��� : "+s.evg());
	}

}

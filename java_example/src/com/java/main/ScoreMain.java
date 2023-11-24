package com.java.main;

import com.java.dto.ScoreVO;//ctrl+shift+O

public class ScoreMain {

	public static void main(String[] args) {
		ScoreVO s =new ScoreVO();//com.java.dto.<< package ¸íÀ» Class¾Õ¿¡ ºÙ¿©Áà¾ßÇÔ
		s.kor =98;
		s.math = 90;
		s.eng = 87;
		s.scien = 78;
		
		System.out.println("ÃÑÁ¡ : "+s.total());
		System.out.println("Æò±Õ : "+s.evg());
	}

}

package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {

	public static void main(String[] args) {
		// 2번 문제에서 2차원 배열로 다시 설계
		final int STUDEN_NUM;
		
		Scanner scann = new Scanner(System.in);

		System.out.print("학생 수 : ");
		STUDEN_NUM = scann.nextInt();scann.nextLine();
		
		ScoreVO[] scores = new ScoreVO[STUDEN_NUM];//address를 STUDEN_NUM크기 만큼 생성
		//입력
		for(int i =0; i<STUDEN_NUM;i++) {
			scores[i] = new ScoreVO();
			scores[i].input();
		}		
		
		//출력
//		new ScoreVO().printLabel(); instance를 선언해줘야만 실행가능
		System.out.print("순번\t");
		ScoreVO.printLabel();
		for(int i =0; i<STUDEN_NUM;i++) {
			System.out.print((i+1)+"\t");
			scores[i].printScore();
		}
	}
}

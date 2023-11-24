package com.java.main;

import java.util.Scanner;

import com.java.cirVO.cirVO;
import com.java.racVO.racVO;
import com.java.triVO.TriVO;


public class mainVO {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String select ="";
		String quit ="";
		while(!quit.toUpperCase().equals("Q")) {
			System.out.println("넓이를 구하실 도형을 선택해주세요");
			System.out.println("1. 삼각형 2. 사각형 3. 원");
			System.out.print("선택 : ");
			select = scann.nextLine();
			
			switch(select) {
				case "1":
					TriVO tri = new TriVO();
					tri.input();
					tri.printout();
					break;
				case "2":
					racVO rac = new racVO();
					rac.input();
					rac.printout();
					break;
				case "3":
					cirVO cir = new cirVO(); 
					cir.input();
					cir.printout();
					break;
				default:
					System.out.println("다시 선택해주세요.");
					break;
			}
			System.out.println("계속 하실건가요?");
			System.out.println("계속 하실거면 아무키나 눌러주세요 (종료 : Q)");
			System.out.print("입력 : ");
			quit = scann.nextLine();
			if((quit == "q")||(quit == "Q")) {
				System.out.println("프로그램을 종료합니다");
			}
			System.out.println();
			
		}
	

	}

}

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
			System.out.println("���̸� ���Ͻ� ������ �������ּ���");
			System.out.println("1. �ﰢ�� 2. �簢�� 3. ��");
			System.out.print("���� : ");
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
					System.out.println("�ٽ� �������ּ���.");
					break;
			}
			System.out.println("��� �Ͻǰǰ���?");
			System.out.println("��� �ϽǰŸ� �ƹ�Ű�� �����ּ��� (���� : Q)");
			System.out.print("�Է� : ");
			quit = scann.nextLine();
			if((quit == "q")||(quit == "Q")) {
				System.out.println("���α׷��� �����մϴ�");
			}
			System.out.println();
			
		}
	

	}

}

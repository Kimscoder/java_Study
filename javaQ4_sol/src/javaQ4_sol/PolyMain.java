package javaQ4_sol;

import java.util.Scanner;

public class PolyMain {
	
	private TriangleVO triangle;
	private RectangularVO rectangular;
	private CircleVO circle;
	private int menu;
	
	public static void main(String[] args) {
		PolyMain main =new PolyMain();
		main.input();
		
		main.process();
		
		main.output();
	}
	
	private void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("도형을 선택하시오.");
		System.out.println("1. 삼각형  2.사각형  3.원");
		menu = scann.nextInt();scann.nextLine();
		
		switch(menu) {
		case 1://삼각형
			triangle = new TriangleVO();
			System.out.print("밑변 : ");
			triangle.baseLine = scann.nextInt(); scann.nextLine();
			System.out.print("높이 : ");
			triangle.height = scann.nextInt();scann.nextLine();
			break;
		case 2://사각형 
			rectangular = new RectangularVO();
			System.out.print("가로 : ");
			rectangular.garo = scann.nextInt(); scann.nextLine();
			System.out.print("세로 : ");
			rectangular.sero = scann.nextInt(); scann.nextLine();
			break;
		case 3://원 
			circle = new CircleVO();
			System.out.print("반지름 : ");
			circle.radius = scann.nextInt();scann.nextLine();
			break;
		default:
			System.out.println("입력이 올바르지 않습니다.");
		}
	}
	private void process() {
		switch(menu) {
		case 1:
		case 2:
		case 3:
			break;
		default:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);//강제종료.(비추천)
		}
	}
	private void output() {
		switch(menu) {
		case 1: 
			System.out.println("삼각형의 넓이 : "+triangle.surface());
			break;
		case 2: 
			System.out.println("사각형의 넓이 : "+rectangular.surface());
			break;
		case 3: 
			System.out.println("원의 넓이 : "+circle.surface());
			break;
		default:;
		}
	}
}

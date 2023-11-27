package javaQ4_sol;

import java.util.Scanner;

import javaQ4_sol.CircleVO;
import javaQ4_sol.RectangularVO;
import javaQ4_sol.TriangleVO;
public class SurfaceSolution {
	
	private TriangleVO triangle;
	private RectangularVO rectangular;
	private CircleVO circle;
	private int menu;
	
	public void input() {
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
	
	public void process() {
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
	
	public void output() {
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
		System.out.println("종료(Q) 혹은 계속하시려면 아무키나 누르세요.");
		String menu = new Scanner(System.in).nextLine();//익명인스턴스 한번 쓰고 버리는 용도
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);//stack을 날려버림
		}
	}
}

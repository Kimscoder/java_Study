package com.java.dto;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;
import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class SurfaceSolution 
	   implements Inputable,Outputable{

	private Shape s;
	private int menu;

	public void start() {
		do {
			input();
	
			process();
	
			output();
		}while(true);
	}
	
	
	protected void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("1.�ﰢ��   2.�簢��    3.��");
		System.out.println("������ �����Ͻÿ�.");
		menu = scann.nextInt();
		scann.nextLine();

		Inputable inputObject = null;
		
		switch (menu) {
		case 1: // �ﰢ��
			inputObject = new TriangleVO();
			break;
		case 2: // �簢��
			inputObject = new RectangularVO();
			break;
		case 3: // ��
			inputObject = new CircleVO();
			break;
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
		}
		
		inputObject.input();
		s = (Shape)inputObject;//���� ĳ����inputable���ϰ� Shape�� �ƴϸ� casting error 
	}

	protected void process() {
		switch (menu) {
		case 1:
		case 2:
		case 3:
			break;
		default:
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0); // ��������. (����õ)
		}
	}

	protected void output() {
		
		Outputable outObject = (Outputable)s;//���� ĳ����
		System.out.println(outObject.output()+s.surface());
		
		System.out.println("����(Q) Ȥ�� ����Ͻ÷��� �ƹ�Ű�� ��������.");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);
		}
	}
}
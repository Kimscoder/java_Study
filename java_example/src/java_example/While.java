package java_example;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		//While �� 
		Scanner scann = new Scanner(System.in);
		String menu = "";
		
		//�Է�
		while(!menu.toUpperCase().equals("Q")) {
	
			System.out.println("1.ȸ������ 2.ȸ����ȸ 3.ȸ������ 4.ȸ������");
			System.out.print("�޴��� �����ϼ��� (���� : Q) :");
			menu = scann.nextLine();
		
			switch(menu) {
				case "1":
					System.out.println("ȸ������..");
					break;
			    case "2":
			    	System.out.println("ȸ����ȸ...");
			    	break;
			    case "3":
			    	System.out.println("ȸ������...");
			    	break;
			    case "4":
			    	System.out.println("ȸ������...");
			    	break;
			    case "q":case "Q": 
			    	System.out.println("���α׷��� �����մϴ�");
			    	break;
			    default:
			    	System.out.println("�ٽü������ּ���");
			    	break;
			}
			
		}
	}

}

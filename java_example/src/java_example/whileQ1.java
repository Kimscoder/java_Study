package java_example;

import java.util.Scanner;

public class whileQ1 {
	public static void main(String[] args) {
		String com_kwb = ""; // ���� 0, ���� 1, �� 2
		int com_kwb_num = 0;

		String my_kwb = ""; // ���� 0, ���� 1, �� 2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";
		String quit="";
		while(!quit.toUpperCase().equals("Q")) {
			// �Է�
			com_kwb_num = (int) (Math.random() * 3);
			
			System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
			System.out.println("����� ������?");
			System.out.println("1.���� 2.���� 3.��");
	
			Scanner scann = new Scanner(System.in);
			menu = scann.nextInt();scann.nextLine();
			if(menu>3||menu<1) {
				System.out.println("�ٽ� �������ּ���");
				System.out.println();
				continue;
			}
			my_kwb_num = menu - 1;
	
			if (com_kwb_num == ((my_kwb_num + 1) % 3)) { // �����...
				juge = "�����ϴ�.";
			} else {
				if (com_kwb_num == my_kwb_num) { // �����..
					juge = "�����.";
				} else { // �̰���.
					juge = "�̰���.";
				}
			}
	
			switch (my_kwb_num) {
			case 0:
				my_kwb = "����";
				break;
			case 1:
				my_kwb = "����";
				break;
			case 2:
				my_kwb = "��";
			}
	
			switch (com_kwb_num) {
			case 0:
				com_kwb = "����";
				break;
			case 1:
				com_kwb = "����";
				break;
			case 2:
				com_kwb = "��";
			}

		// ���
			System.out.println("��ǻ�� : " + com_kwb);
			System.out.println("��� : " + my_kwb);
			System.out.println(juge);

			System.out.println("�� �Ͻǰǰ���?(�׸� Q)");
			System.out.println("����Ͻ� �ǰ���?");
			System.out.println("����ϽǰŸ� �ƹ�Ű�� �Է��ϼ���");
			quit = scann.nextLine();
		}//do-While���� ���հ��� ������ do-While ������ �ѹ��� ������
	}
}

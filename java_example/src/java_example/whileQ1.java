package java_example;

import java.util.Scanner;

public class whileQ1 {
	public static void main(String[] args) {
		String com_kwb = ""; // 가위 0, 바위 1, 보 2
		int com_kwb_num = 0;

		String my_kwb = ""; // 가위 0, 바위 1, 보 2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";
		String quit="";
		while(!quit.toUpperCase().equals("Q")) {
			// 입력
			com_kwb_num = (int) (Math.random() * 3);
			
			System.out.println("컴퓨터는 결정했습니다.");
			System.out.println("당신의 선택은?");
			System.out.println("1.가위 2.바위 3.보");
	
			Scanner scann = new Scanner(System.in);
			menu = scann.nextInt();scann.nextLine();
			if(menu>3||menu<1) {
				System.out.println("다시 선택해주세요");
				System.out.println();
				continue;
			}
			my_kwb_num = menu - 1;
	
			if (com_kwb_num == ((my_kwb_num + 1) % 3)) { // 졌어요...
				juge = "졌습니다.";
			} else {
				if (com_kwb_num == my_kwb_num) { // 비겼어요..
					juge = "비겼어요.";
				} else { // 이겼어요.
					juge = "이겼어요.";
				}
			}
	
			switch (my_kwb_num) {
			case 0:
				my_kwb = "가위";
				break;
			case 1:
				my_kwb = "바위";
				break;
			case 2:
				my_kwb = "보";
			}
	
			switch (com_kwb_num) {
			case 0:
				com_kwb = "가위";
				break;
			case 1:
				com_kwb = "바위";
				break;
			case 2:
				com_kwb = "보";
			}

		// 출력
			System.out.println("컴퓨터 : " + com_kwb);
			System.out.println("당신 : " + my_kwb);
			System.out.println(juge);

			System.out.println("더 하실건가요?(그만 Q)");
			System.out.println("계속하실 건가요?");
			System.out.println("계속하실거면 아무키나 입력하세요");
			quit = scann.nextLine();
		}//do-While문이 접합가능 차이점 do-While 무조건 한번은 실행함
	}
}

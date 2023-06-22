package Temp;

import java.util.Scanner;

public class TestClass {	
	
	public int test(int temp) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 온도 :" + temp);
		System.out.println("1. 온도 ↑");
		System.out.println("2. 온도 ↓");
		System.out.print(">>> ");	
		int num = sc.nextInt();
		
		switch(num) {
			case 1:
				System.out.print("올릴 온도를 입력해주세요. : ");
				int up = sc.nextInt();
				temp = temp + up;
				break;
			case 2: 
				System.out.print("내릴 온도를 입력해주세요. : ");
				int down = sc.nextInt();
				temp = temp - down;
				break;
			default :
				System.out.println("다시 입력해주세요.");
				break;
		}
		System.out.println("조절한 온도는 현재 " + temp + "도 입니다.");
		return temp;
	}
}



package water_purifier_main;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	while(true) {
		int num;
		System.out.println("1. 온도 조절");
		System.out.println("2. 필터 오염도 확인");
		System.out.println("3. 얼음 잔량 확인");
		System.out.println("4. 전체 설정 확인");
		System.out.print(">>>");
		num = input.nextInt();
		
		TestClass t = new TestClass();
		
		switch (num) {
		case 1:break;
		case 2:break;
		case 3:break;
		case 4:break;
		}
	}
}
}

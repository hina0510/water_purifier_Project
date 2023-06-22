package water_purifier_main;

import java.util.Scanner;

import ice.IceClass;

import Temp.TestClass;
import mingdid1.filter;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	IceClass ice = new IceClass();
	TestClass t = new TestClass();
	filter f = new filter();
	int temp = 23, num, num1,t_poll=0, i=0;
	while(true) {
		System.out.println("1. 온도 조절");
		System.out.println("2. 필터 오염도 확인");
		System.out.println("3. 얼음 잔량 확인");
		System.out.println("4. 전체 설정 확인");
		System.out.print(">>>");
		num = input.nextInt();
		
		switch (num) {
		case 1:
			temp = t.test(temp);
			break;
		case 2:
			t_poll = f.pollution();
			break;
		case 3:
			while(true) {
				System.out.println("1. 얼음 생성");
				System.out.println("2. 얼음 추출");
				System.out.println("3. 얼음 잔량 확인");
				System.out.println("4. 나가기");
				System.out.print(">>>");
				num1 = input.nextInt();
				if(num1 == 1) {
					ice.createIce();
				}else if(num1 == 2) {
					ice.putIce();
				}else if(num1 == 3) {
					i=ice.printIce();
				}else if(num1 == 4) {
					break;
				}
			}
			break;
		case 4:
			System.out.println("정수기 물의 온도는\n"+temp+"도 입니다.\n 커피기계의 필터 오염도는"+t_poll+"도 입니다.\n 현재 얼음의 갯수는 "+i+"개 입니다");
			break;
		}
	}
}
}

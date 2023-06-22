package water_purifier_main;

import java.util.Scanner;

import ice.IceClass;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	IceClass ice = new IceClass();
	while(true) {
		int num, num1;
		System.out.println("1. 온도 조절");
		System.out.println("2. 필터 오염도 확인");
		System.out.println("3. 얼음 잔량 확인");
		System.out.println("4. 전체 설정 확인");
		System.out.print(">>>");
		num = input.nextInt();
		switch (num) {
		case 1:break;
		case 2:break;
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
					ice.printIce();
				}else if(num1 == 4) {
					break;
				}
			}
			break;
		case 4:break;
		}
	}
}
}

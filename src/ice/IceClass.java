package ice;

import java.util.Scanner;

public class IceClass {
	Scanner input = new Scanner(System.in);
	public int ice=0, su=0;
	public void createIce() {
		if(ice>=0 && ice<=50) {
			if(ice>40) {
				System.out.println("얼음이 가득찼습니다(최대 50개)");
			}else {
				System.out.println("얼음을 10개 추가합니다");
				ice +=10;
			}
		}
	}
	public void putIce() {
		System.out.print("추출할 얼음 수 : ");
		su = input.nextInt();
		if(su>ice) {
			System.out.println("얼음이 부족합니다");
		}else {
			System.out.println(ice+"개 추출합니다");
			ice -= su;
		}
	}
	public int printIce() {
		if(ice==0) {
			System.out.println("얼음이 없습니다");
		}else {
			System.out.println("현재 얼음 갯수 : "+ice);
		}
		return ice;
		
	}
}

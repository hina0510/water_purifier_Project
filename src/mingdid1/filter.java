package mingdid1;

public class filter {
	public void pollution() {
		
		double rand = Math.random() * 100;
		int t_poll = (int)rand;
		
		System.out.println("현재 오염도는 " + t_poll + "입니다");
		if (t_poll > 50) {
			System.out.println("필터 교체");
		}else {
			System.out.println("사용 가능");
		}
		
	}
	
}

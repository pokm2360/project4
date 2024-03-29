package loop;

public class quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단을 홀수단만 출력
		
		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 2 == 0) continue;
		// if (dan % 2 == 1) 홀수단이면 구구단 출력 
			System.out.println("*****" + dan + "단*****");
			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + "x" + times + "=" + dan * times);
			}
			System.out.println();
		}
		
}
	
}

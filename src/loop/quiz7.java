package loop;

public class quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단을 3단부터 7단까지만 출력
		
		for (int dan = 3; dan <= 7; dan++) {
			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + "x" + times + "=" + dan * times);
			}
			System.out.println();
		}
		
}
	
}

package loop;

public class quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 100까지의 수 중에서 3의 배수만 출력
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue;
			} System.out.println(i);
		} 
}
	
}

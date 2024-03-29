package loop;

public class quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문을 사용해 1부터 100까지 더하는 코드 작성
		//단 중간에, 합이 500이 넘어가면 중단
		
		//for문이 종료되기 전 num과 sum 값 출력
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.println("결과: " + "i는 " + i + " sum은 " + sum);
			if (sum >= 500) {
				break;
			}
		}
		
}
	
}

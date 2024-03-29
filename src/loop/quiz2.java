package loop;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문을 사용해서 11부터 20까지 합 구하고 출력
		
		int num = 11;
		int sum = 0;
		while (num <= 20) {
			sum = sum + num;
			num++;
		}
		System.out.println(sum);
	}

}

package conditional;

public class quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		switch문 사용!
//		학생의 점수를 저장할 변수 선언, 0~99 사이의 값 저장
		// 점수가 90~99 면 "수"
		// 점수가 80~89 면 "우"
		// 점수가 70~79 면 "미"
//		그 외는 "양"을 출력
		
		int score = 79;
		int value = score / 10;
		
		switch (value) {
			case (9):
			System.out.println("수");
			break;
			
			case (8):
				System.out.println("우");
				break;
				
			case (7):
				System.out.println("미");
				break;
				
			default:
				System.out.println("양");
		}
	}

}

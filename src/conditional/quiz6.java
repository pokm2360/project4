package conditional;

public class quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if문 사용!
//		학생의 점수를 저장할 변수 선언, 0~99 사이의 값 저장
		// 점수가 90~99 면 "수"
		// 점수가 80~89 면 "우"
		// 점수가 70~79 면 "미"
//		그 외는 "양"을 출력
		
		int score = 80;
		
		if (score >= 90 && score <= 99) {
			System.out.println("수");
		} else if (score >= 80 && score <= 89) {
			System.out.println("우");
		} else if (score >= 70 && score <= 79) {
			System.out.println("미");
		} else {
			System.out.println("양");
		}
	}

}

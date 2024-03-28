package quiz;

public class quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 월을 저장할 변수를 선언, 1~12 사이의 값 저장
//		월에 해당하는 계절 출력
		
		int mon = 13;
		
		if (mon >=3 && mon <=5) {
			System.out.println("현재 계절을 봄입니다.");
		} else if (mon >= 6 && mon <=8){
			System.out.println("현재 계절을 여름입니다.");
		} else if (mon >= 9 && mon <=11){
			System.out.println("현재 계절을 가을입니다.");
		} else if (mon == 12 || mon >= 1 || mon <= 2){
			System.out.println("현재 계절을 겨울입니다.");
		} else {
			System.out.println("월이 잘못되었습니다.");
		}
	}

}

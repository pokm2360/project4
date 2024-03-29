package conditional;

public class quiz3 {

	public static void main(String[] args) {
	
		// 문자형 변수 gender를 선언, 문자 하나를 대입
		// 변수값이 F면 "여성입니다", 그렇지 않으면 "남성입니다" 출력
		
		char gender = 'm';
		if (gender == 'F') {
			System.out.println("여성입니다");
		} else {
			System.out.println("남성입니다");
		}
	}

}

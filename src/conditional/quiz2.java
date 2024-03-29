package conditional;

public class quiz2 {

	public static void main(String[] args) {
		// 정수형 변수 age를 선언, 나이 대입
		// 문자형 변수 gender를 선언, 성별을 F 또는 M으로 대입
		// 나이가 8살 이상이고 성별이 여자라면 "여학생입니다" 출력
		
		int age = 15;
		String gender = "F";
		
		if (age >=8 && gender == "F") {
			System.out.println("여학생입니다");
		}
		
	}

}

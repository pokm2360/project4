package conditional;

public class quiz1 {

	public static void main(String[] args) {
		// int형 변수를 선언하고 값을 대입하세요
		
		// 그리고 조건문을 사용해서 변수의 값이 2의 배수거나 3의배수라면
		// "2또는 3의 배수입니다"를 출력
		
		int a = 98569856;
		if (a % 2 == 0 || a % 3 == 0) {
			System.out.println("2 또는 3의 배수입니다: " + a);
		}

	}
}
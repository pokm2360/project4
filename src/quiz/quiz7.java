package quiz;

public class quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// char 타입 변수를 선언, 문자 b,c,d 중 하나 입력
		// 문자에 해당하는 동물을 출력
		
		char type = 'c';
		
		switch (type) {
		case 'b': 
			System.out.println('새');
			break;
		case 'c': 
			System.out.println("고양이");
			break;
		case 'd':
			System.out.println("강아지");
			break;
		}
	}

}

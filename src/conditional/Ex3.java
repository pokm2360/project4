package conditional;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 7;
		
		if (age < 8) {
			System.out.println("미 취학 아동입니다.");
		} else if (age < 14) {
			System.out.println("초등학생입니다.");
		} else if (age < 20) {
			System.out.println("중,고등학생입니다.");
		} else {
			System.out.println("성인입니다.");
		}
		
	}

}

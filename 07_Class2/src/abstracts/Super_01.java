package abstracts;

public class Super_01 {

	public static void main(String[] args) {
		
		// Super 클래스 객체 생성
		// Super super = new Super();
		Sub sub = new Sub();
		
		sub.num1 = 135;
		
		System.out.println
			("calc() 메서드 호출 >>> "+ sub.calc());
		
		sub.output();  // 추상메서드 재정의 호출

	}

}

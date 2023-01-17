package interfaces;

public class Inter_01 {

	public static void main(String[] args) {

		// 인터페이스는 객체 생성이 불가능하다.
		// Inter inter = new Inter(); //추상메서드가 있어서 객체 생성이 안된다.

		Sub sub = new Sub();

		sub.output1();
		sub.output2();

		System.out.println(Inter.num);

		// static final 상수로 인식을 함.
		// 상수 값을 변경하는 것은 불가능하다.
		// sub.num = 350; =>error 가 발생함.

	}

}

package finals;

/*
 * final 지정자
 * - 클래스나 멤버변수, 멤버메서드에 적용해서 사용함.
 * - 클래스 : - 변경할 수 없는 클래스, 확장될 수 없는 클래스.
 *           - final로 지정된 클래스는 다른 클래스의 조상
 *             클래스가 될 수 없음.
 * - 멤버메서드 : - 변경될 수 없는 메서드.
 *              - final로 선언된 메서드는 오버라이딩을 통해서
 *                재정의를 할 수 없음.
 * - 멤버변수 : - 변수명 앞에 final 이라는 키워드가 붙으면 값을
 *              변경할 수 없음. ==> 상수화
 *              
 * - 대표적인 final 클래스는 String 클래스와 Math 클래스임.
 */

class AA {
	final int su = 235; // 상수로 인식 ==> 값 변경이 안된다.

	final void output() {

		System.out.println("final output() 메서드 호출");

	}
}

class BB extends AA {

	// su = 123; //상수로 지정되었기 때문에 값을 변경이 안된다.

	/// final로 지정된 메서드는 메서드 재정의를 할 수 없음.

//	@Override
//	void output() {
//
//		System.out.println("output() 메서드 재정의");
//
//	}

}

final class CC {

} // 내용없이 선언만해줌

//final로 지정된 클래스는 다른 클래스의 부모 클래스가 될 수 없다.
//class DD extends CC {
//
//}

public class Final_01 {

	public static void main(String[] args) {

	}

}

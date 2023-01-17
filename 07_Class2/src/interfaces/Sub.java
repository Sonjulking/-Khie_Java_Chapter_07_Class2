package interfaces;

public class Sub implements Inter { // 재정의를 안해주면 sub도 인터페이스가 되버린다.

	@Override
	public void output1() {

		System.out.println("인터페이스 output1() 추상메서드 재정의");

	}

	@Override
	public void output2() {

		System.out.println("인터페이스 output2() 추상메서드 재정의");

	}

}

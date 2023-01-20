package exam3;

public class Circle_A implements Shape_A {

	int radius; // 반지름 변수

	public Circle_A() {
	} // 기본 생성자

	public Circle_A(int radius) {

		this.radius = radius;
	} // 인자 생성자

	// 인터페이스 추상메서드 재정의
	@Override
	public double findArea() {

		return 3.14 * radius * radius;

	}

}

package exam3;

public class Rectangle_A implements Shape_A {

	int width; // 가로 변수
	int height; // 세로 변수

	public Rectangle_A() {
	} // 기본 생성자

	public Rectangle_A(int width, int height) {
		this.width = width;
		this.height = height;
	} // 인자 생성자

	@Override
	public double findArea() {

		return width * height;

	}

}

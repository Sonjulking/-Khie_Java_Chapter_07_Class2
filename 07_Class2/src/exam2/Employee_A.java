package exam2;

public abstract class Employee_A { // 추상 클래스

	// 멤버변수
	private String name; // 이름

	public Employee_A() {
	} // 기본 생성자

	public Employee_A(String name) {
		this.name = name;
	} // 인자 생성자

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 자식클래스에서 재정의를 진행할
	// 급여를 계산하는 메서드.
	abstract int getPays();

}

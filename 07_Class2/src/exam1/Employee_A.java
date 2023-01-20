package exam1;

public class Employee_A {
	// 멤버 변수
	String name; // 이름

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 자식클래스에서 재정의를 진행할 급여를 계산하는 메서드.
	int getPays() {
		return 0;
	}

}

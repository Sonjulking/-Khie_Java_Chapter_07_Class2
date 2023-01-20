package exam1;

public class Temporary_A extends Employee_A {

	// 멤버변수
	// String name;

	private int time;// 작업 시간
	private int pay;// 시간당 급여

	public Temporary_A() {
	} // 기본 생성자

	public Temporary_A(String name, int time, int pay) {

		this.name = name;
		this.time = time;
		this.pay = pay;
	} // 인자 생성자

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	int getPays() {
		return time * pay;
	}

}

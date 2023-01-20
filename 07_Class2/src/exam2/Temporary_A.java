package exam2;

public class Temporary_A extends Employee_A {

	private int time; // 작업 시간
	private int pay; // 시간당 급여

	public Temporary_A() {
	} // 기본 생성자

	public Temporary_A(String name, int time, int pay) {
		super(name);
		this.time = time;
		this.pay = pay;
	} // 인자 생성자

	public int getTime() {
		return time;
	}

	public int getPay() {
		return pay;
	}

	@Override
	int getPays() {

		return time * pay;
	}

}

package exam1;

public class Permanent_A extends Employee_A {

	// String name;

	// 멤버변수
	private int pay; // 기본 급여
	private int bonus; // 보너스

	public Permanent_A() {
	}

	public Permanent_A(String name, int pay, int bonus) {

		this.name = name;
		this.pay = pay;
		this.bonus = bonus;

	} // 인자 생성자

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	int getPays() {
		return pay + bonus;
	}

}

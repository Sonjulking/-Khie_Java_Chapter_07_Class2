package exam2;

public class Permanent_A extends Employee_A {

	// 멤버변수
	private int salary;
	private int bonus;

	public Permanent_A() {
	} // 기본 생성자

	public Permanent_A(String name, int salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	} // 인자 생성자

	public int getSalary() {
		return salary;
	}

	public int getBonus() {
		return bonus;
	}

	// 부모클래스(추상클래스)의 추상메서드를 재정의.
	@Override
	int getPays() {
		return salary + bonus;
	}

}

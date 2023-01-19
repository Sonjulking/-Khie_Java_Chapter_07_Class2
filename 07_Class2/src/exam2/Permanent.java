package exam2;

public class Permanent extends Employee {

	int salary;
	int bonus;

	public Permanent() {
		this.salary = 0;
		this.bonus = 0;

	}

	public Permanent(String name) {
		super(name);
	}

	@Override
	public int getPays(int salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;

		return salary + bonus;
	}

}

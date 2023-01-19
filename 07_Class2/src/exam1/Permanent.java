package exam1;

public class Permanent extends Employee {

	int pay;
	int bonus;

	public Permanent() {

		this.pay = 0;
		this.bonus = 0;

	}

	@Override
	public int getPay(int pay, int bonus) {

		this.pay = pay;
		this.bonus = bonus;

		return pay + bonus;

	}

}

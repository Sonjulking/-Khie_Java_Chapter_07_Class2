package exam1;

public class Temporary extends Employee {

	int time;
	int pay;

	public Temporary() {

		time = 0;
		pay = 0;
	}

	@Override
	public int getPay(int time, int pay) {

		this.time = time;
		this.pay = pay;

		return time * pay;
	}

}

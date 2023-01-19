package exam2;

public class Temporary extends Employee {

	int time;
	int pay;

	public Temporary() {
		this.time = 0;
		this.pay = 0;
	}

	public Temporary(String name) {
		super(name);
	}

	@Override
	public int getPays(int time, int pay) {
		this.time = time;
		this.pay = pay;
		return time * pay;
	}

}

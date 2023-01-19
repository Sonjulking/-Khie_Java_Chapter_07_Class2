package exam2;

public abstract class Employee {

	private String name;

	public Employee() {
	}

	public Employee(String name) {
		this.name = name;

	}

	public String getNames() {
		return name;
	}

	public abstract int getPays(int a, int b);

}

package exam3;

public class Circle implements Shape {

	double radius1;
	double radius2;

	public Circle() {
		this.radius1 = 0;
		this.radius2 = 0;

	}

	@Override
	public double findArea(double radius1, double radius2) {

		return radius1 * radius2 * 3.14;
	}

}

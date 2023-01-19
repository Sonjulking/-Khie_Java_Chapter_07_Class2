package exam3;

public class Rectangle implements Shape {

	int width;
	int height;

	public Rectangle() {

		this.width = 0;
		this.height = 0;
	}

	@Override
	public double findArea(double width, double height) {
		return width * height;
	}

}

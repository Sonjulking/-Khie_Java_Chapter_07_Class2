package exam3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("도형을 선택하세요.(1.원형, 2.사각형)");
		System.out.print("도형 선택 >>> ");
		int shapeType = sc.nextInt();

		switch (shapeType) {

		case 1:

			Circle circle = new Circle();
			System.out.print("반지름 입력 >>> ");

			Double rad = sc.nextDouble();
			System.out.println("원의 면적" + circle.findArea(rad, rad));

			break;
		case 2:
			Rectangle rectangle = new Rectangle();

			System.out.print("가로 >>> ");
			Double w = sc.nextDouble();

			System.out.print("세로 >>> ");
			Double h = sc.nextDouble();
			System.out.println("사각형의 면적" + rectangle.findArea(w, h));

		}

		sc.close();

	}

}

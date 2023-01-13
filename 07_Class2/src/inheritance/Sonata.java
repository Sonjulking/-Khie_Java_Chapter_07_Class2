package inheritance;

public class Sonata extends Car {   // 자식 클래스

	// int cc;
	// int door;
	String model;     // 차량 모델명
	
	void output() {
		System.out.println("모델명 >>> " + model);
		System.out.println("배기량 >>> " + cc);
		System.out.println("차량 문 수 >>> " + door);
		
	}
}

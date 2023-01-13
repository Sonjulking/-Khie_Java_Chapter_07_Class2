package overriding;

public class Flyer_03 {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		Airplane airplane = new Airplane();
		
		bird.takeOff();
		bird.fly(); bird.land();
		
		System.out.println();
		
		airplane.takeOff();
		airplane.fly(); airplane.land();
		

	}

}

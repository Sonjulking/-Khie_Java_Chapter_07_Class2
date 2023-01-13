package inheritance;

public class Car_01 {

	public static void main(String[] args) {
		
		/*
		 * Sonata 클래스의 객체 생성 과정
		 * Sonata 클래스의 객체 생성 시에 JVM은
		 * 우선적으로 Car 부모클래스의 객체를 
		 * 생성한 후에 그 다음에 Sonata 클래스의
		 * 객체를 생성함.
		 */
		
		Sonata sonata = new Sonata();
		
		sonata.output();
		
		System.out.println();
		
		sonata.model = "소나타";
		
		sonata.cc = 2000;
		
		sonata.door = 4;
		
		sonata.output();
		

	}

}

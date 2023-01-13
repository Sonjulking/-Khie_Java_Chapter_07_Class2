package overriding;

public class Airplane extends Flyer {

	@Override
	void takeOff() {
		System.out.println("비행기가 공항에서 이륙을 한다.~~~");
	}
	
	@Override
	void fly() {
		System.out.println("비행기가 구름 사이를 날아간다.~~~");
	}
	
	@Override
	void land() {
		System.out.println("비행기가 공항에 착륙한다.~~~");
	}
	
}

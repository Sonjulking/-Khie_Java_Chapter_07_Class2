package overriding;

/*
 * [문제] 부모클래스인 Flyer 클래스에 takeOff(),
 *       fly(), land() 원형 메서드가 있다.
 *       Bird, Airplane 이라는 자식클래스에서 
 *       Flyer 클래스를 상속받아서 해당 메서드를
 *       자식클래스에 맞게 재정의하여 화면에 출력해 보세요.
 */

public class Flyer {

	void takeOff() {
		System.out.println("하늘로 날아오르다~~~");
	}
	
	void fly() {
		System.out.println("하늘을 날아다닌다~~~");
	}
	
	void land() {
		System.out.println("땅으로 내려온다~~~");
	}
}

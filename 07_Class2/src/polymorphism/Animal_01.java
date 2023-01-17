package polymorphism;

public class Animal_01 {

	public static void main(String[] args) {

		// Dog dog = new Dog();

		// 다형성으로 객체를 생성
		Animal dog = new Dog(); // 조상의 참조변수로 자식의 객체 생성

		dog.sound(); // 조상의 참조변수로 자식의 객체를 생성후 자식의 메서드 호출

		// dog.output(); // 조상클래스에서 상속을 받은 멤버들만 접근할수 있음. 자식클래스에서 만들어진 멤버들에는 접근을 할수 없음.

	}

}

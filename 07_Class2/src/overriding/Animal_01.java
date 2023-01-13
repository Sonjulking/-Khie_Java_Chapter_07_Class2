package overriding;

public class Animal_01 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		
		dog.sound();
		cat.sound(); tiger.sound();

	}

}

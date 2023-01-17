package exercise;

import java.util.ArrayList;

public class DogTest_02 {

	public static void main(String[] args) {

		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("멍멍이", "치와와"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}

		for (Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}

	}

}

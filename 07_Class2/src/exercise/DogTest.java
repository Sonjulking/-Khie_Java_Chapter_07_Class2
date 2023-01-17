package exercise;

public class DogTest {

	public static void main(String[] args) {

		Dog[] dog = new Dog[5];
		dog[0] = new Dog("또식이", "토이푸들");
		dog[1] = new Dog("춘배", "진돗개");
		dog[2] = new Dog("춘식", "삽살개");
		dog[3] = new Dog("루이", "페르시안 고양이");
		dog[4] = new Dog("덕자", "치와와");

		for (int i = 0; i < dog.length; i++) {

			System.out.println(dog[i].showDogInfo());

		}

		System.out.println();

		for (Dog d : dog) {

			System.out.println(d.showDogInfo());

		}

	}

}

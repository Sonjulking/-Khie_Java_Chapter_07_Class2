package polymorphism;

class TV {

	boolean power;
	int channel;

	void power() {

		power = !power;

	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
}

class SmartTv extends TV {

	String text; // 캡션(자막)을 보여주기 위한 문자열

	void caption() {

	}

}

public class Main_02 {

	public static void main(String[] args) {

	}

}

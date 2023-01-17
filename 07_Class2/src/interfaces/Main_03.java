package interfaces;

interface Camera {

	// 사진을 찍는 기능
	void photo();
}

interface DMB {

	// TV를 보는 기능
	void viewTv();

}

interface MP3 {

	// 음악을 듣는 기능
	void playMp3();

}

class MyPhone implements Camera, DMB, MP3 {

	@Override
	public void playMp3() {

		System.out.println("핸드폰으로 음악을 들어요");

	}

	@Override
	public void viewTv() {

		System.out.println("핸드폰으로 TV를 봐요.");

	}

	@Override
	public void photo() {

		System.out.println("핸드폰으로 사진을 찍어요.");

	}

}

public class Main_03 {

	public static void main(String[] args) {

		MyPhone phone = new MyPhone();

		phone.photo();
		phone.viewTv();
		phone.playMp3();

	}

}

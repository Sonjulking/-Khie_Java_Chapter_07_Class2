package polymorphism;

import java.util.Scanner;

public class OverWatch_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		OverWatch watch = null; // 참조변수 초기화

		System.out.print("플레이할 캐릭터 선택 (1.메이 / 2.겐지 / 3.맥크리) : ");

		int bunho = sc.nextInt();

		if (bunho == 1) {

			watch = new Mei();

		} else if (bunho == 2) {

			watch = new Gengi();

		} else if (bunho == 3) {

			watch = new Mccree();

		} else {
			System.out.println("잘못된 번호입니다.");
		}

		watch.name();
		watch.leftClick();
		watch.rightClick();
		watch.shiftButton();
		watch.eButton();
		watch.qButton();

		sc.close();

	}

}

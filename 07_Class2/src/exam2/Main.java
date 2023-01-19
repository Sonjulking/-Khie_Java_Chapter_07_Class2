package exam2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("고용형태-정규직<P>, 임시적<T>를 입력하세요.");
		String empolyeeType = sc.next();

		switch (empolyeeType) {

		case "P":
		case "p":

			System.out.println("이름, 기본급, 보너스를 입력하세요.");
			String pmName = sc.next();
			Permanent pm = new Permanent(pmName);
			int pmPay = sc.nextInt();
			int bonus = sc.nextInt();

			System.out.println("==================================");
			System.out.println("고용 형태 : 정규직");
			System.out.println("이름 : " + pm.getNames());
			System.out.printf("급여 : %,d원", pm.getPays(pmPay, bonus));

			break;

		case "T":
		case "t":

			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
			String tpName = sc.next();
			Temporary tp = new Temporary(tpName);
			int time = sc.nextInt();
			int tpPay = sc.nextInt();
			System.out.println("==================================");
			System.out.println("고용 형태 : 임시직");
			System.out.println("이름 : " + tp.getNames());
			System.out.printf("급여 : %,d원", tp.getPays(time, tpPay));

			break;

		}

		sc.close();
	}

}

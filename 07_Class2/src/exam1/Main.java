package exam1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("고용형태-정규직<P>, 임시적<T>를 입력하세요.");
		String empolyeeType = sc.next();

		switch (empolyeeType) {

		case "P":
		case "p":

			Permanent pm = new Permanent();
			System.out.println("이름, 기본급, 보너스를 입력하세요.");
			String pmName = sc.next();
			int pmPay = sc.nextInt();
			int bonus = sc.nextInt();
			pm.setName(pmName);
			System.out.println("==================================");
			System.out.println("고용 형태 : 정규직");
			System.out.println("이름 : " + pm.getName());
			System.out.printf("급여 : %,d원", pm.getPay(pmPay, bonus));

			break;

		case "T":
		case "t":

			Temporary tp = new Temporary();
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
			String tpName = sc.next();
			int time = sc.nextInt();
			int tpPay = sc.nextInt();
			tp.setName(tpName);
			System.out.println("==================================");
			System.out.println("고용 형태 : 임시직");
			System.out.println("이름 : " + tp.getName());
			System.out.printf("급여 : %,d원", tp.getPay(time, tpPay));

			break;

		}

		sc.close();

	}

}

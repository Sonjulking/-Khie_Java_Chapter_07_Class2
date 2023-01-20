package exam1;

import java.util.Scanner;

public class Main_A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("고용형태 - 정규직 <P>, 임시직<T>를 입력하세요.");

		String pt = sc.next();

		if (pt.equalsIgnoreCase("P")) {

			System.out.println("이름, 기본급, 보너스를 입력하세요.");

			Permanent_A permanent = new Permanent_A(sc.next(), sc.nextInt(), sc.nextInt());

			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("고용형태 : 정규직");
			System.out.println("이름 : " + permanent.getName());
			System.out.printf("급여 : %,d원\n", permanent.getPays());
		} else if (pt.equalsIgnoreCase("T")) {
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
			Temporary_A temporary = new Temporary_A(sc.next(), sc.nextInt(), sc.nextInt());

			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("고용형태 : 임시직");
			System.out.println("이름 : " + temporary.getName());
			System.out.printf("급여 : %,d원\n", temporary.getPays());

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		sc.close();

	}

}

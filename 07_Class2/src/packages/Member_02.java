package packages;

import java.util.Scanner;

import model.Member;
/*
 * [문제] 회원 수를 키보드로 입력을 받고 회원 수 만큼 회원의 정보를 객체 배열에 저장을 하여 화면에 회원의 정보를 보여주세요.
 * 예 ) Member [] members = new Member[sc.nextInt()]
 */

public class Member_02 {

	public static void main(String[] args) {

		// 1.키보드로 회원수를 입력을 받아서 객체배열의 크기로 잡아주자.
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 수 입력 : ");

//		Member[] members = new Member[Integer.parseInt(sc.nextLine())];
		Member[] members = new Member[sc.nextInt()];
		sc.nextLine(); // 버퍼에 쌓인거 없애주기

		// 2.반복문을 이용하여 회원수만큼 회원 객체 생성후에 회원의 정보를 키보드로 입력을 받자.

		for (int i = 0; i < members.length; i++) {

			System.out.println((i + 1) + "번째 회원정보 저장(아이디, 비밀번호, 이름, 나이, 연락처 ,주소)");

//			Member members = new Member();
//			members[i] = member;

			members[i] = new Member(); // 위에 두개를 합침

			System.out.print("회원의 아이디 입력 : ");
			members[i].setId(sc.nextLine());
			System.out.print("회원의 비밀번호 입력 : ");
			members[i].setPwd(sc.nextLine());
			System.out.print("회원의 이름 입력 : ");
			members[i].setName(sc.nextLine());
			System.out.print("회원의 나이 입력 : ");
			members[i].setAge(sc.nextInt());
			sc.nextLine();

			System.out.print("회원의 연락처 입력 : ");
			members[i].setPhone(sc.nextLine());
			System.out.print("회원의 주소 입력 : ");
			members[i].setAddress(sc.nextLine());

//			members[i] = new Member(sc.nextLine(), sc.nextLine(), sc.nextLine(),
//					Integer.parseInt(sc.nextLine()),
//					sc.nextLine(), sc.nextLine());

		}
		System.out.println("아이디\t비밀번호\t이   름\t나   이\t연락처\t주   소");
		// 3. 반복문을 이용하여 객체배열에 저장된 각각의 회원의 정보를 화면에 출력해보자.
		for (int i = 0; i < members.length; i++) {

			System.out.println(members[i].getId() + "\t"
					+ members[i].getPwd() + "\t"
					+ members[i].getName() + "\t"
					+ members[i].getAge() + "\t"
					+ members[i].getPhone() + "\t"
					+ members[i].getAddress());

			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");

//			System.out.println();
//			System.out.println(i + "번째 회원 아이디 >>> " + members[i].getId());
//			System.out.println(i + "번째 회원 비밀번호 >>> " + members[i].getPwd());
//			System.out.println(i + "번째 회원 이름 >>> " + members[i].getName());
//			System.out.println(i + "번째 회원 나이 >>> " + members[i].getAge());
//			System.out.println(i + "번째 회원 연락처 >>> " + members[i].getPhone());
//			System.out.println(i + "번째 회원 주소 >>> " + members[i].getAddress());

		}

		sc.close();

	}

}

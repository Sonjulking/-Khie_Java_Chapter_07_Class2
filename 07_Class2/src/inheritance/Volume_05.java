package inheritance;

import java.util.Scanner;

public class Volume_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TV tv = new TV();
		Radio radio = new Radio();
		Computer computer = new Computer();
		
		while(true) {
			System.out.print
			   ("1. TV  /  2. Radio  /  3. Computer  /  4. 종료 : ");
			
			int menu = sc.nextInt();
			
			if(menu == 4) {
				break;
			}
			
			System.out.print("1. 볼륨Up / 2. 볼륨Down");
			
			int volume = sc.nextInt();
			
			switch(menu) {
				case 1 : // TV 메뉴를 선택한 경우
					if(volume == 1) {
						tv.volumeUp();
					}else {
						tv.volumeDown();
					}
					break;
				case 2 : // Radio 메뉴를 선택한 경우
					if(volume == 1) {
						radio.volumeUp();
					}else {
						radio.volumeDown();
					}
					break;
				case 3 : // Computer 메뉴를 선택한 경우
					if(volume == 1) {
						computer.volumeUp();
					}else {
						computer.volumeDown();
					}
					break;
			}  // switch~case문 end
			
			System.out.println();
			
			System.out.println("::::::::::::::::::::::::");
			
			System.out.println
			   ("TV Volume : " + tv.getVolume() + " / "
				+ "Radio Volume : " + radio.getVolume()	+ " / "
				+ "Computer Volume : " + computer.getVolume());
			
			
		}  // while 반복문
		
		System.out.println();
		
		System.out.println("수고 많이 하셨습니다.~~~~");
		
		sc.close();

	}

}

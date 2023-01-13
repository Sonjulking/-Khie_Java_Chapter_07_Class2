package abstracts;

public class SmartPhone_03 {

	public static void main(String[] args) {
		
		Galaxy galaxy = new Galaxy();
		galaxy.purpose();
		galaxy.spec();   // 추상메서드 재정의
		
		System.out.println();
		
		IPhone iPhone = new IPhone();
		iPhone.purpose(); 
		iPhone.spec();   // 추상메서드 재정의
		

	}

}

package abstracts;

public class Professor extends Person {

	String major;        // 학과 과목
	
	public Professor() {  }
	
	public Professor(String name, String major) {
		
		this.name = name;
		this.major = major;
	}
	
	
	
	// 추상 메서드를 재정의한 메서드
	@Override
	void output() {
		
		System.out.println(name + " 교수입니다.");
		System.out.println(major + " 과목 교수입니다.");
	}

}

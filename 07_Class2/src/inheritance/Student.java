package inheritance;

public class Student extends Person {

	// String name;
	// int age;
	// String job;
	String major;      // 학과
	
	public Student() {  }    // 기본 생성자
	
	public Student(String name, int age,
			String job, String major) {
		
		this.name = name;
		this.age = age;
		this.job = job;
		this.major = major;
		
	}  // 인자 생성자
	
	void getStudentInfo() {
		System.out.println("이 름 >>> " + name);
		System.out.println("나 이 >>> " + age);
		System.out.println("직 업 >>> " + job);
		System.out.println("학 과 >>> " + major);
	}
	
	
}

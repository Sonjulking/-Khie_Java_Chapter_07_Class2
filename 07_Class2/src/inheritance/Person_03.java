package inheritance;

public class Person_03 {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name = "홍길동";
		student.age = 27;
		student.job = "대학생";
		student.major = "컴퓨터공학과";
		
		student.getStudentInfo();
		
		System.out.println();
		
		Employee employee = new Employee();
		employee.name = "임정훈";
		employee.age = 38;
		employee.job = "IT학원 강사";
		employee.salary = 5000;
		
		employee.getEmployeeInfo();
		
		

	}

}

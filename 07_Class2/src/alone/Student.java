package alone;

public class Student {
	int studentID = 0;
	String name = null;

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	public void showStudentInfo() {

		System.out.println(studentID + name);

	}

}

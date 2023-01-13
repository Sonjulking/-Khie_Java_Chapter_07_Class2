package inheritance;

/*
 * 1. super() 키워드
 *    - 자식클래스에서 부모클래스의 생성자를 호출하는 명령어.
 *      형식) super(인자);   // 인자는 생략이 가능함.
 *      
 * 2. this() 키워드
 *    - 현재(자식) 클래스에서 현재 클래스의 다른 생성자를
 *      호출하는 명령어.
 *      형식) this(인자);
 * 
 * 주의) this() 키워드는 반드시 생성자 첫 문장에 와야 함.
 */

public class Point3D extends Point {
	
	// int x;
	// int y;
	int z;
	
	public Point3D() {
		// 부모 클래스의 기본 생성자를 호출하는 명령어.
		super();
	}  // 기본 생성자
	
	public Point3D(int x, int y) {
		// this.x = x;
		// this.y = y;
		super(x, y);
	}
	
	public Point3D(int x, int y, int z) {
		// this.x = x;
		// this.y = y;
		this(x, y);
		this.z = z;
	}
	
	
	void output() {
		System.out.println("x 좌표 >>> " + x);
		System.out.println("y 좌표 >>> " + y);
		System.out.println("z 좌표 >>> " + z);
	}

}

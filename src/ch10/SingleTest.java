package ch10;

public class SingleTest {

	private static SingleTest s = new SingleTest();
	private int x;
	private int y;
	
	
	private SingleTest() { // 생성자를 private으로 지정, 5번 줄 처럼
		x = 10;				// 클래스 내부에서만 만들수있고 밖에선 못만든다.
		y = 20;
	}
	
	public static SingleTest getSingleTest() {
		return s;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	
	void print() {
		System.out.println("x, y좌표 : "+ x + " , "+ y);
		
	}
	
	
	
	
}

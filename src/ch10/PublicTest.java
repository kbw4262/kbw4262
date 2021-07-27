package ch10;

public class PublicTest {
	public int x;
	private int y; // 클래스 안에서만 접근 가능
	
	public PublicTest(int x, int y) {//생성자
		this.x = x;
		this.y = y; // private멤버는 클래스에서 접근 가능
	}
	
	public void print() {
		setValue();
		System.out.println("x = "+ x + "y = "+y);
		
	}
	private void setValue() {
		this.x = 100;
		this.y = 200;
	}
}

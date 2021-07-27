package ch10;

public class SingleTest {

	private static SingleTest s = new SingleTest();
	private int x;
	private int y;
	
	
	private SingleTest() { // �����ڸ� private���� ����, 5�� �� ó��
		x = 10;				// Ŭ���� ���ο����� ������ְ� �ۿ��� �������.
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
		System.out.println("x, y��ǥ : "+ x + " , "+ y);
		
	}
	
	
	
	
}

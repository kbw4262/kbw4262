package ch10;

public class PublicTest {
	public int x;
	private int y; // Ŭ���� �ȿ����� ���� ����
	
	public PublicTest(int x, int y) {//������
		this.x = x;
		this.y = y; // private����� Ŭ�������� ���� ����
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

package ch10;

public class PublicTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicTest t = new PublicTest(10,10);
		t.x = 20; // x�� public �̶� �ۿ��� ���� ����
		//t.y = 30;
		//t.setValue private �޼���� �Ⱥ���...
		t.print();
	}

}

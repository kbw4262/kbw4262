package ch9;

public class InitMethod {

	int x = initMember(); // ������� x�� �ʱⰪ���� �޼����� ���ϰ� �Ҵ�.
	static int y = initMember_s();
	// static ��� ������ ���� - �ʱⰪ�� �ʱ�ȭ �޼��尡 ��ȯ�ϴ� ������ �Ҵ�
	
	final int initMember() { // �������̵��� �����ϴ� Ű���� -�����ε� �� �ٸ�
		return 10;
	}
	static int initMember_s() { // �ʱ�ȭ �޼���
		return 10;
	}
	
	
	InitMethod() {
		//������, ��� ����� 20���� �ʱ�ȭ.
		System.out.println("������ ������");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		x = 20;
		y = 20;
		
	}
	
	
	void print() {
		System.out.println("������ ������");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}
	
}

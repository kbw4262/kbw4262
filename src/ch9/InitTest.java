package ch9;

public class InitTest {

	int x = 5;
	static int y = 5; // static ����
	
	String str = "aaa";
	
	static { // ��������(static����) �ʱ�ȭ
		System.out.println("static ���� �ʱ�ȭ �� \ny : " + y);
		y =10;
	}
	{	// �ʱ�ȭ ���
		System.out.println("�ʱ�ȭ ��� ���� �� \nx : "+ x);
		System.out.println("y = " + y);
		System.out.println("str = "+str);
		x= 20;
		y= 20;
		str = "bbb";
		
	}
	InitTest(){ // ������
		System.out.println("������ ������ \nx = "+x);
		System.out.println("y = "+y);
		x=30;
		y=30;
		str = "ccc";
		
	}
	void print() {
		System.out.println("��� �ʱ�ȭ �� \nx = "+x);
		System.out.println("y = "+y);
		System.out.println("str = "+str);
	}
	
	
}

package ch8;

public class localTest {

	int memVar; // �������
	
	void localVar() {
		
		int a = 10, c;
		{
			int b= 20;
			System.out.println("��Ͼ�");
			System.out.println(" a + b = " + (c=a+b) );
			
			
		}
		
//		System.out.println("b = "+ b); // ���� �߻�

		int b =30; 
		System.out.println(" ��� �� ");
		System.out.println("a = "+ a+ ", b = "+b);
		
		//memVar������ ��������� 0���� �ڵ� �ʱ�ȭ
		
		System.out.println("�� �Ҵ� ���� memVar = " + memVar);
		memVar = 100;
		System.out.println("�� �Ҵ� ���� memVar = " + memVar);
		
	}
	
	
	void printVar() {
		
		System.out.println("memVar = "+ memVar);
		//System.out.println("a = " +a+ " ,b = "+b);
	}
	
	
}

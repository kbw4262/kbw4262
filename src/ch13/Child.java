package ch13;

public class Child extends Parent { // �Ҿƹ������� �� ��ӹ���.

	public String hobby;
	
	@Override
	public void print() { // parent ���� ������ print �� Child�� �°� ������
		System.out.println("Child");
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}
	@Override
	public void test() {	 // ��ӹ��� �߻� �޼��� test ����
		System.out.println("hobby = " + hobby );
		
	}
	
	// ���ο� �޼���. �����Ǹ� �ϴ°� �ƴϱ� ������ Override�� �ۼ������ʴ´�.
	public void parentPirnt() {
		super.print(); // �� Ŭ�������� �������� ���� Ŭ������ �޼��带 ȣ��
		// �����ǵ� ����Ŭ������ �޼��带 ���� Ŭ�������� ȣ���Ϸ��� super�� �̿�
	}
	
}

package ch13;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandParent gp = new Child(); // ��ĳ����
		gp.name = "grand papa";
		gp.age = 90;
		//gp.hobby = "go";
		//hobby�� GrandParent�� ������ Ÿ���� �ƴ϶� ���� �Ұ�.
		gp.print();
		gp.test();
		
		/*
		 * GrandParent ��ü�δ� ��ü������ �Ұ����ϴ�.
		 * ������ ��ĳ�������� ����Ŭ����(Child)���� ����Ǹ鼭 
		 * GrandParent�� ������ Ÿ�Ը� �ҷ����� �������� ���� ����.
		 */
		
		System.out.println("---------------");
		
		
		
		Child c = new Child(); // �׳� ����.
		c.name = "Child momo";
		c.age = 10;
		c.hobby = "study";
		c.print();
		c.test();
		
		System.out.println("---------------");
		
		c.parentPirnt(); // parentPrint() �� ȣ���� ����Ŭ����(parent)�� print()�� ȣ��
		// super�� ���� Ŭ������ print()�� ��ȯ�� ���̴�.
		

		
		
	}

}

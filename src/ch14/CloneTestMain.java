package ch14;

public class CloneTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloneTest c1 = new CloneTest(); // cloneTest�� ��ü�� ����
		CloneTest c2 = null;
		try {	// ������ c1��ü�� clone()
			c2 = (CloneTest) c1.clone();// �޼���� ��ü�� �����Ѵ�.
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		// 16~20�� ���� c1, c2 ��ü ����� ���� �ٸ� ���� �Ҵ�.
		c1.x = 10;
		c1.y = 20;
		
		c2.x = 30;
		c2.y = 40;
		//22~26�� ���� c1, c2�� ������� ����� �������� ���, ������ �ٸ���, �������� �ٸ�.
		System.out.println("c1.x = "+ c1.x + ", c1.y = " + c1.y);
		System.out.println(c1);
		
		System.out.println("c2.x = "+ c2.x + ", c2.y = " + c2.y);
		System.out.println(c2);
		
		System.out.println("---------------");
		// �� ���� = clone();
		
		try {	// ������ c1��ü�� clone()
			c2 = (CloneTest) c1.clone();// �޼���� ��ü�� �����Ѵ�.
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("c1.x = "+ c1.x + ", c1.y = " + c1.y);
		System.out.println(c1);
		
		System.out.println("c2.x = "+ c2.x + ", c2.y = " + c2.y);
		System.out.println(c2);
		
		
		System.out.println(" --------------- ");
		// ������ ����
		
		c2 = c1;
		System.out.println(c1);
		System.out.println(c2);

		System.out.println("c2.x = "+ c2.x + ", c2.y = " + c2.y); // �޸� ����.
	}

}

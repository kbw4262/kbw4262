package ch14;

public class WrapTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapTest t = new WrapTest();
		
		// new Integer(10) Integer��ü�� �����ϴ� �ڵ�� �����ڿ� ���� 10��
		// �����Ͽ� 10�� ������ ���� Integer ��ü�� ����.
		t.add(new Integer(10));
		t.add(new Integer(25));
		t.add(new Float(3.56f));
		t.add(new Float(56.123f));
		t.add(new String("����"));
		t.add(new WrapTest().arr[0]); // ���ο� ��ü�� ���������� �翬�� null��
		t.print(); // arr �迭 ��Ҹ� ���.
		System.out.println();
		
		
		String str1 = "123"; // String ��ü�� �ΰ� �����Ͽ� ���� ���ڿ��� ����
		String str2 = "456"; // "123", "456"�� ���ڷ� �������� ���ڿ�
		
		int x = Integer.parseInt(str1); // ���ڹ��ڿ��� ���� ���ڷ� ��ȯ
		int y = Integer.parseInt(str2);
		System.out.println("���ڿ��� �� : " + str1 + str2);
		System.out.println("������ �� : " + (x + y));
		
	}

}

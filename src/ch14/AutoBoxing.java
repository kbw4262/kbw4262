package ch14;

public class AutoBoxing extends Test {

	public static void main(String[] args) {
		Object[] arr= new Object[5];
		
		int i;
		arr[0] = 15; 
		arr[1] = 3.44f;
		arr[2] = 'x';
		arr[3] = "abc";
		arr[4] = true;
		for(i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = " + arr[i]);
		}
		//������ ��ü�� ����ϸ� �������� ��µ�����, �ڵ� ��ڽ��� ó���Ǿ� �⺻ Ÿ���� ���� ���� ���
		
		System.out.println(arr[4]);
		
		TestPrint x = new TestPrint();
		x.print();
		
	}
	
}

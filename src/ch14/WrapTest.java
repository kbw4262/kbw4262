package ch14;

public class WrapTest {
	
		public Object[] arr = new Object[10]; // object Ÿ���� �迭�� ����
		// object�� ��� Ŭ������ ���� Ŭ���� �̹Ƿ� ��� Ŭ������ ��ü��
		// ��ĳ���� �ؼ� �� �迭�� ������ �� �ִ�.
		
		public int cnt=0;
		public void add(Object obj) {   // arr�迭�� object ��ü�� �߰��Ѵ�.
			arr[cnt++] = obj;
		}
		
		
		public void print() {
			for(int i = 0; i< cnt; i++) {
				Object o = arr[i];
				if( o instanceof Integer) { // ���� ��ü�� Integer�� ��ü���� Ȯ��
					System.out.println(((Integer)o).intValue());
				}
				else if(o instanceof Float) { // ���� ��ü�� Float�� ��ü���� Ȯ��
					System.out.println(((Float)o).floatValue());
					// floatValue() �޼���� Float��ü�� float�� �⺻Ÿ������ ��ȯ.
					// o �տ� ���� Float�� ��ü�ϱ� �빮�� F
				}
				else {
					System.out.println("arr ["+i+"] = " + arr[i]);
				}
				
			}
			
			
		}
		
		

}

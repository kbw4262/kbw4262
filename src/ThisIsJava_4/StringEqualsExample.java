package ThisIsJava_4;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="�Ź�ö";
		String str2 ="�Ź�ö";
		if(str1 == str2) {
			System.out.println(" str1 �� str2 �� ������ ����");
			
		}
		else {
			System.out.println(" str1 �� str2 �� ������ �ٸ�");
		}
		
		if(str1.equals(str2)) {
			System.out.println(" str1 �� str2 �� ���ڿ��� ����");
		}
		else {
			System.out.println(" str1 �� str2 �� ���ڿ��� �ٸ�");
		}
		
		String str3 = new String("�Ź�ö");
		String str4 = new String("�Ź�ö");
		
		if(str3 == str4) {
			System.out.println(" str3 �� str4 �� ������ ����");
			
		}
		else {
			System.out.println(" str3 �� str4 �� ������ �ٸ�");
		}
		
		if(str3.equals(str4)) {
			System.out.println(" str3 �� str4 �� ���ڿ��� ����");
		}
		
		
		
	}

}

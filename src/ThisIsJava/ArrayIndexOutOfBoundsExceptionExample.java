package ThisIsJava;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		String data1 = args[0]; // Run - > Run Configueations -> Arguments �ǿ��� 
		String data2 = args[1]; // Program arguments �Է¶��� �ƹ��͵� ����.
								// ��, ���� �Ű����� �����ϱ� ��ŭ�� �迭�� ���̰� �ִ��� ���������ʾ� ����
		System.out.println("args[0]" + data1);
		System.out.println("args[1]" + data2);
		*/
		
		// ���� ó��
		
		if(args.length == 2) {
			String str1 = args[0]; 
			String str2 = args[1]; 
									
			System.out.println("args[0]" + str1);
			System.out.println("args[1]" + str2);
			
		}
		else {
			System.out.println("[������]");
			System.out.println("Java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("��1, ��2");
		}
		
		
		
		
	}
	

}

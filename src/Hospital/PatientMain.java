package Hospital;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PatientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient[] patient = new Patient[10];
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		int patientCount=0;//  �Կ����� ȯ�� �� �ʱ�ȭ
		
		
		do {
			System.out.println("�Կ� ���� ���α׷�");
			System.out.println("1. ȯ�� �Կ� ���� / 2. �Կ� ȯ�� ��ȸ / 3. �Կ� ȯ�� ���� ���� / 4. ��� ���� / 0. ������");
			System.out.print("����Ͻ� ��ɿ� �ش��ϴ� ���ڸ� �Է��ϼ��� : ");
			try {
				menu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("������ �Է� �����մϴ�.");
			}
			
			switch(menu) {
			
			case 1:
				//ȯ�� �Կ� ����
				//Ÿ���� �ȸ����� ���ܰ� �߻��� �� �ֽ��ϴ�.
				/*����ó�� �ʼ�. �����ڿ��� �ص���.
				 * 
				 *�������)
				 * try {
							menu = sc.nextInt();
						}catch(InputMismatchException e) {
							System.out.println("������ �Է� �����մϴ�.");
						}
			
				 */
				//patientCount++;
				break;
				
			case 2:
				// ȯ�� �Կ� ��ȸ
				break;
				
			case 3:
				// �Կ� ȯ�� ���� ����
				break;
				
			case 4:
				// �Կ� ȯ�� ��� 
				break;
				
			default : 
					System.out.println("�߸� �Է��ϼ˽��ϴ�.");
					System.out.println();
			}
			
			
		}while(menu != 0);
		
		System.out.println("�ݺ��� Ż���");
		
		// ȯ�ڸ� ���ǿ� ����
		
		
		
	}

}

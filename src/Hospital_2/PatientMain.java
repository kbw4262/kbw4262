package Hospital_2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PatientMain {


	public ArrayList<Patient> patient = new ArrayList<Patient>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramMethod a = new ProgramMethod();
		//Patient[] patient = new Patient[10];
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		int patientCount=0;//  �Կ����� ȯ�� �� �ʱ�ȭ
		
		
		do {
			System.out.println("�Կ� ���� ���α׷�");
			System.out.println("1. ȯ�� �Կ� ���� / 2. �Կ� ȯ�� ��ȸ / 3. �Կ� ȯ�� ���� ���� / 4. ��� ���� / 5. ������");
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
				a.add();
				break;
				
			case 2:
				// ȯ�� �Կ� ��ȸ
				a.select();
				break;
				
			case 3:
				// �Կ� ȯ�� ���� ����
				a.update();
				break;
				
			case 4:
				// �Կ� ȯ�� ��� 
				break;
			case 5:
				System.out.println("���α׷� �����մϴ�");
				break;
				
			default : 
					System.out.println("�߸� �Է��ϼ˽��ϴ�.");
					System.out.println();
					break;
			}
			
			
		}while(menu != 5);
		
		
		// ȯ�ڸ� ���ǿ� ����
		
		
		
	}

}

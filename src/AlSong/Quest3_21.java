package AlSong;

import java.util.Scanner;

public class Quest3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� 1~12�� ���������� �о �ش��ϴ� ������ ǥ���ϴ� ���α׷�");
	
		int month =0;
		Scanner sc = new Scanner(System.in);
		
		
		do {

			System.out.print("1~12 �� ������ �Է��ϼ��� : ");
			
			month = sc.nextInt();
		switch(month) {
		
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		
		case 6: case 7: case 8:
			System.out.println("����");
			break;

		case 9: case 10: case 11:
			System.out.println("����");
			break;
	
		case 12: case 1: case 2:
			System.out.println("�ܿ�");
			
			break;
		default:
			System.out.println("�߸� �Է��ϼ˽��ϴ�.");
			}			
		}while(month!=0);
	
	
	}

}

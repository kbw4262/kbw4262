package AlSong;

import java.util.Scanner;

public class Q4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * �Է��� �������� ��� ����� �� ������ ǥ���ϴ� ���α׷��� �ۼ�
			 * 
			 */
		
		int num =0; // ���� ������
		int cnt =0; // ��� ���� ī����
		int i =1;
		String st = ""; // ��� ��¿�
		Scanner sc = new Scanner(System.in);
		System.out.print(" ����� ���� ���� ���� �Է��Ͻÿ� : ");
		num = sc.nextInt();
		do {
			if((num%i) == 0) {
				
				st += i + " ";
				cnt++;
			}
			i++;
		}while(i <= num);
		System.out.println(" ��� : "+ st);
		System.out.println(" ����� ���� : " + cnt);
		 // ������� ���� ���������� �Ѱ�...
	
		
		
		// �ٸ��� ǥ��
		System.out.println("������ : ");
		int n = sc.nextInt();
			cnt = 0;
			for(i = 1; i<= n; i++) {
				if(n%i==0) {
					System.out.println(i + " ");
					cnt ++;
				}
			}
		System.out.println(" ����� " + cnt + "�� �Դϴ�");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

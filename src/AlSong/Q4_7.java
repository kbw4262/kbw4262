package AlSong;

import java.util.*;
public class Q4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * �Է��� ���� ���� ��ŭ '*'�� ǥ���ϴ� ���α׷��� �ۼ�����.
			 * ���������� �� �ٲ� ���ڸ� ����� ��.
			 * ��, ���� ���� 1�̸��̸� �� �ٲ� ���ڸ� ǥ���ؼ��� �� �ȴ�.
			 */
		int num =0;
		char star = '*';
		String stars ="";
		Scanner sc = new Scanner(System.in);
		System.out.print("'*'�� ǥ���� ���� �ۼ� : ");
		num = sc.nextInt();
		
		if(num < 1) {
			System.out.print(star);
		}
		else {
			for (int i =0; i<num; i++) {
				stars += star;
			}
			System.out.print(stars + "\n");
			
		}
		
		
	}

}

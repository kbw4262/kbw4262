package KBW_test;

import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2���� ���� �������� �о ���ڰ� ������ ����̸� "B�� A�� ����̴�."��� ǥ��
		// �׷��� ������ "B�� A�� ����� �ƴϴ�."��� ǥ���ϴ� ���α׷� 
		
		int a =0;
		int b =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("A�� �Է� :");
		a = sc.nextInt();
		System.out.print("B�� �Է� :");
		b = sc.nextInt();
		
		if(a%b!=0) {
			System.out.println("B�� A�� ����� �ƴϴ�.");
		}
		else {
			System.out.println("B�� A�� ����̴�.");
		}
		
		
		
	}

}

package KBW_test;

import java.util.Scanner;

public class Rem {
	public static int remGet(int a,int b) {
		return a%b;
	}
	public static void Print() {
		Scanner sc = new Scanner(System.in);
		int a= 0, b=0;
		System.out.print("���������� �� 1: ");
		a = sc.nextInt();
		System.out.print("���������� �� 2: ");
		b = sc.nextInt();
		if(b == 0) {
			System.out.println("�ڿ� �� ������ ���� 0�� �Ǽ� �ȵ˴ϴ�!");
		}
		else System.out.println(a + " % "+ b + " = " + remGet(a,b));
	}
}

package KBW_test;

import java.util.Scanner;

public class Div {
	Div(){
		
	}
	public static String DivGet(double a,double b) {
		double c = a/b;
		return String.format("%.2f", c);
	}
	public static void Print() {
		Scanner sc = new Scanner(System.in);
		double a= 0, b=0;
		System.out.print("���� �� 1: ");
		a = sc.nextDouble();
		System.out.print("���� �� 2: ");
		b = sc.nextDouble();
		if(b == 0) {
			System.out.println(" 0���� ���� �� �����ϴ�!");
		}
		else System.out.println(a + " / "+ b + " = " + DivGet(a,b));
	}
}

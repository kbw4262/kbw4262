package KBW_test;

import java.util.Scanner;

public class Sub {
	public static int subGet(int a,int b) {
		return a-b;
	}
	public static void Print() {
		Scanner sc = new Scanner(System.in);
		int a= 0, b=0;
		System.out.print("»¬ °ª 1: ");
		a = sc.nextInt();
		System.out.print("»¬ °ª 2: ");
		b = sc.nextInt();
		System.out.println(a + " - "+ b + " = " + subGet(a,b));
	}
}

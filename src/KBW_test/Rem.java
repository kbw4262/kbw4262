package KBW_test;

import java.util.Scanner;

public class Rem {
	public static int remGet(int a,int b) {
		return a%b;
	}
	public static void Print() {
		Scanner sc = new Scanner(System.in);
		int a= 0, b=0;
		System.out.print("나머지구할 값 1: ");
		a = sc.nextInt();
		System.out.print("나머지구할 값 2: ");
		b = sc.nextInt();
		if(b == 0) {
			System.out.println("뒤에 올 나머지 값은 0이 되선 안됩니다!");
		}
		else System.out.println(a + " % "+ b + " = " + remGet(a,b));
	}
}

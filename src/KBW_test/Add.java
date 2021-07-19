package KBW_test;
import java.util.*;
public class Add {

	public static int addGet(int a,int b) {
		return a+b;
	}
	public static void Print() {
		Scanner sc = new Scanner(System.in);
		int a= 0, b=0;
		System.out.print("더할 값 1: ");
		a = sc.nextInt();
		System.out.print("더할 값 2: ");
		b = sc.nextInt();
		System.out.println(a + " + "+ b + " = " + addGet(a,b));
	}
}

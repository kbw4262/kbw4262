package KBW_test;
import java.util.*;
public class MathAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int abs = 0;
		System.out.println("정수 값을 입력해주세요.");
		abs = sc.nextInt();
		
		abs = Math.abs(abs);
		System.out.println("절대값 : " + abs);
		
		
	}

}

package AlSong;

import java.util.Scanner;

public class Q7_1 {

	public static void main(String[] args) {
		
		int num =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 :");
		num = sc.nextInt();
		
		System.out.println("부호 : "+ SignOf(num));
		
		
	}
	
	static int SignOf(int num) {
		int sign = 0;
		
		
		if(num > 0) {
		sign = 1;	
		}
		else if(num <0) {
			sign = -1;
		}
		else sign = 0;
		
		return sign;
	}
	
	
	
}

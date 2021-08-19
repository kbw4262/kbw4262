package KBW_test;

import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2개의 양의 정숫값을 읽어서 후자가 전자의 약수이면 "B는 A의 약수이다."라고 표시
		// 그렇지 않으면 "B는 A의 약수가 아니다."라고 표시하는 프로그램 
		
		int a =0;
		int b =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("A를 입력 :");
		a = sc.nextInt();
		System.out.print("B를 입력 :");
		b = sc.nextInt();
		
		if(a%b!=0) {
			System.out.println("B는 A의 약수가 아니다.");
		}
		else {
			System.out.println("B는 A의 약수이다.");
		}
		
		
		
	}

}

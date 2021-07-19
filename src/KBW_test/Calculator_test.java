package KBW_test;
import java.util.Scanner;
public class Calculator_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("나눗셈 제외한 연산들은 모두 정수 타입만 입력 가능");
		
		// 다른 연산도 추가로 넣을 순 있지만 귀찮다...밥 먹어야함..
		int sw = 0;
		Scanner sc = new Scanner(System.in);
		do {
		// 나머지 제외한 연산들은 모두 정수 타입만 입력 가능
		
		// 계산 질의
		System.out.println("계산기 콘솔 기본 테스트용");
		System.out.println("원하는 계산 방식을 선택하세요");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("5. 나머지");
		System.out.println("0. 종료");
		System.out.print(" 선택 : ");
		sw = sc.nextInt();
		
		
		//스위치
		
		switch(sw) {
		case 1:
			Add ad = new Add();
			ad.Print();
			break;
		case 2:
			Sub sb = new Sub();
			sb.Print();
			break;
		case 3:
			Mul ml = new Mul();
			ml.Print();
			break;
		case 4:
			Div dv = new Div();
			dv.Print();
			break;
		case 5:
			Rem rm = new Rem();
			rm.Print();
			break;
		case 0:
			System.out.println("프로그램을 종료합니다.");
		
			} // 스위치 끝
		// 하..또 안되네 github...
		
		System.out.println();
		}while(sw != 0);
	}

}

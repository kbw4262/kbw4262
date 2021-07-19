package ch4;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String grade = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("학년 입력 : ");
			grade = sc.nextLine();
			
			
			
			switch(grade){
			case "1학년":
				System.out.println("1학년입니다.");
			break;
			
			case "2학년":
				System.out.println("2학년입니다.");
			break;
			
			case "3학년":
				System.out.println("3학년입니다.");
			break;
			
			case "4학년":
				System.out.println("4학년입니다.");
			break;
			default:
				System.out.println("학년을 잘못 입력하셨습니다.");
			break;
			}
			
			char A = 'A';
			char a = 'a';
			int inA, ina;
			inA = A;
			ina = a;
			System.out.println(ina + "  " + inA);
			
			
	}

}

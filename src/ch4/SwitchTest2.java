package ch4;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String grade = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("�г� �Է� : ");
			grade = sc.nextLine();
			
			
			
			switch(grade){
			case "1�г�":
				System.out.println("1�г��Դϴ�.");
			break;
			
			case "2�г�":
				System.out.println("2�г��Դϴ�.");
			break;
			
			case "3�г�":
				System.out.println("3�г��Դϴ�.");
			break;
			
			case "4�г�":
				System.out.println("4�г��Դϴ�.");
			break;
			default:
				System.out.println("�г��� �߸� �Է��ϼ̽��ϴ�.");
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

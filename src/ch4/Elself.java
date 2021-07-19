package ch4;
import java.util.Scanner;


public class Elself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		int jumsu = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		jumsu = sc.nextInt();
		if(jumsu >= 90) {
			System.out.println("A");
		}
		else if(jumsu >= 80) {
			System.out.println("B");
		}
		else if(jumsu >= 70) {
			System.out.println("C");
		}
		else if(jumsu >= 60) {
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
		}while(true);
		
	}

}

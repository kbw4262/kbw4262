package KBW_test;

import java.util.Scanner;

public class Disappear {
	
	static void print() {
		

		System.out.println("Momay Was Disappear !");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String answ = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" She's here..?");
		do {
		System.out.print("(Y / N) :");
		answ = sc.next();
		
		if(answ.equals("Y") || answ.equals("y")){
			
			System.out.println("Come here My love..¢¾");
			
		}
		else if(answ.equals("N") || answ.equals("n")) {
			print();
		}
		
		else System.out.println("r u kidding me??");
		}while(!(answ.equals("Y")||answ.equals("y")));
	}

}

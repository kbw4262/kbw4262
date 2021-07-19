package AlSong;

import java.util.Scanner;

public class Quest2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 변수 x와 y의 합과 평균을 구하자.");
		System.out.print("x : ");
		x =  sc.nextInt();
		System.out.print("y : ");
		y =  sc.nextInt();
		System.out.println(x + " + " + y + " ="+ (x+y));
		System.out.println(x +" 와 " + y + "의 평균 ="+ ((x+y)/2));
		
		
	}

}

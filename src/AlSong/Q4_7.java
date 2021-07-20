package AlSong;

import java.util.*;
public class Q4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * 입력한 값의 개수 만큼 '*'를 표시하는 프로그램을 작성하자.
			 * 마지막에는 줄 바꿈 문자를 출력할 것.
			 * 단, 읽은 값이 1미만이면 줄 바꿈 문자를 표시해서는 안 된다.
			 */
		int num =0;
		char star = '*';
		String stars ="";
		Scanner sc = new Scanner(System.in);
		System.out.print("'*'를 표시할 개수 작성 : ");
		num = sc.nextInt();
		
		if(num < 1) {
			System.out.print(star);
		}
		else {
			for (int i =0; i<num; i++) {
				stars += star;
			}
			System.out.print(stars + "\n");
			
		}
		
		
	}

}

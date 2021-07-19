package AlSong;

import java.util.Scanner;

public class Quest3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("월을 1~12의 정숫값으로 읽어서 해당하는 계절을 표시하는 프로그램");
	
		int month =0;
		Scanner sc = new Scanner(System.in);
		
		
		do {

			System.out.print("1~12 의 정수를 입력하세요 : ");
			
			month = sc.nextInt();
		switch(month) {
		
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		
		case 6: case 7: case 8:
			System.out.println("여름");
			break;

		case 9: case 10: case 11:
			System.out.println("가을");
			break;
	
		case 12: case 1: case 2:
			System.out.println("겨울");
			
			break;
		default:
			System.out.println("잘못 입력하셧습니다.");
			}			
		}while(month!=0);
	
	
	}

}

package AlSong;

import java.util.Scanner;

public class Q4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * 입력한 정수값의 모든 약수와 그 개수를 표시하는 프로그램을 작성
			 * 
			 */
		
		int num =0; // 구할 정수값
		int cnt =0; // 약수 개수 카운팅
		int i =1;
		String st = ""; // 약수 출력용
		Scanner sc = new Scanner(System.in);
		System.out.print(" 약수를 구할 정수 값을 입력하시오 : ");
		num = sc.nextInt();
		do {
			if((num%i) == 0) {
				
				st += i + " ";
				cnt++;
			}
			i++;
		}while(i <= num);
		System.out.println(" 약수 : "+ st);
		System.out.println(" 약수의 개수 : " + cnt);
		 // 여기까지 내가 개인적으로 한것...
	
		
		
		// 다르게 표현
		System.out.println("정수값 : ");
		int n = sc.nextInt();
			cnt = 0;
			for(i = 1; i<= n; i++) {
				if(n%i==0) {
					System.out.println(i + " ");
					cnt ++;
				}
			}
		System.out.println(" 약수는 " + cnt + "개 입니다");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

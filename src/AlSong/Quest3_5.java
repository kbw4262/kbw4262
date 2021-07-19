package AlSong;
import java.util.*;
public class Quest3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정숫값을 읽어 부호 (양수/음수/0) 를 판정하는 프로그램을 작성하자");
		
		int num =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		
		num = sc.nextInt();
		
		if (num >0) {
			System.out.println(num +" 의 부호는 양수입니다.");
		}
		else if (num == 0) {
			System.out.println(num + "입니다.");
		}
		else System.out.println(num + " 의 부호는 음수입니다.");
		
		
	}

}

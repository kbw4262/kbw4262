package ch13.game;
import java.util.*;
public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Character character = null;
		PlayGame pg = null;
		System.out.println("원하는 캐릭터를 선택하시오.");
		System.out.println("1. 피카츄 2. 꼬북이 3.이상해씨");
		System.out.print(" = ");
		int x = sc.nextInt();
		switch(x) {

			case 1:
			character = new Picach();
			break;
			case 2:
			character = new GoBook();
			break;
			case 3:
			character = new Lee();
			break;
			default :
			System.out.println("잘못 선택하셧습니다.");
			
		}
		
		
		
		if(character == null) {
			System.out.println("게임을 종료합니다.");
			return; // 프로그램 종료
		}
		else {
			pg = new PlayGame(character);
		}
		
		
		while(true) {
			pg.printMenu(sc);
			if(pg.isExit()) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		
	}

}

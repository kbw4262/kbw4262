package ch13.game;
import java.util.*;
public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Character character = null;
		PlayGame pg = null;
		System.out.println("���ϴ� ĳ���͸� �����Ͻÿ�.");
		System.out.println("1. ��ī�� 2. ������ 3.�̻��ؾ�");
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
			System.out.println("�߸� �����ϼ˽��ϴ�.");
			
		}
		
		
		
		if(character == null) {
			System.out.println("������ �����մϴ�.");
			return; // ���α׷� ����
		}
		else {
			pg = new PlayGame(character);
		}
		
		
		while(true) {
			pg.printMenu(sc);
			if(pg.isExit()) {
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
		
	}

}

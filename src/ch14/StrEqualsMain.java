package ch14;

import java.util.Scanner;

public class StrEqualsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String id = "test";
		String pwd = "1234";
		
		System.out.print(" Id : ");
		String n_id = sc.next();
		System.out.print(" pwd : ");
		String n_pwd = sc.next();
		
		if(id.equals(n_id) && pwd.equals(n_pwd)) {
			System.out.println(" �α��� ����");
		}
		else {
			System.out.println(" �߸��� �� �Դϴ�. ");
		}
		sc.close();
	}

}

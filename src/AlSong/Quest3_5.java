package AlSong;
import java.util.*;
public class Quest3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������� �о� ��ȣ (���/����/0) �� �����ϴ� ���α׷��� �ۼ�����");
		
		int num =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ : ");
		
		num = sc.nextInt();
		
		if (num >0) {
			System.out.println(num +" �� ��ȣ�� ����Դϴ�.");
		}
		else if (num == 0) {
			System.out.println(num + "�Դϴ�.");
		}
		else System.out.println(num + " �� ��ȣ�� �����Դϴ�.");
		
		
	}

}

package KBW_test;
import java.util.Scanner;
public class Calculator_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ ������ ������� ��� ���� Ÿ�Ը� �Է� ����");
		
		// �ٸ� ���굵 �߰��� ���� �� ������ ������...�� �Ծ����..
		int sw = 0;
		Scanner sc = new Scanner(System.in);
		do {
		// ������ ������ ������� ��� ���� Ÿ�Ը� �Է� ����
		
		// ��� ����
		System.out.println("���� �ܼ� �⺻ �׽�Ʈ��");
		System.out.println("���ϴ� ��� ����� �����ϼ���");
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. ���ϱ�");
		System.out.println("4. ������");
		System.out.println("5. ������");
		System.out.println("0. ����");
		System.out.print(" ���� : ");
		sw = sc.nextInt();
		
		
		//����ġ
		
		switch(sw) {
		case 1:
			Add ad = new Add();
			ad.Print();
			break;
		case 2:
			Sub sb = new Sub();
			sb.Print();
			break;
		case 3:
			Mul ml = new Mul();
			ml.Print();
			break;
		case 4:
			Div dv = new Div();
			dv.Print();
			break;
		case 5:
			Rem rm = new Rem();
			rm.Print();
			break;
		case 0:
			System.out.println("���α׷��� �����մϴ�.");
		
			} // ����ġ ��
		// ��..�� �ȵǳ� github...
		
		System.out.println();
		}while(sw != 0);
	}

}

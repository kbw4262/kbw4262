package KBW_test;
import java.util.*;

public class JumsuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] jumsu = new int[4];
		String[] title = new String[] {"����", "����", "����", "����"};
		int sum = 0; 	// ���� ����
		double avg = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		// �̸��� �Է¹޾� ������ �����Ѵ�.
		
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name = sc.next();
		
		//4������ �Է¹޾� �����Ѵ� ( ����,����,����,���� )
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(title[i]+"�� ������ �Է����ּ��� : ");
			jumsu[i] = sc.nextInt();

			//�迭�� ����� ������ ������ �̿��ؼ� ���� ���Ѵ�.
			sum += jumsu[i];
		}
		
		//�迭�� ����� ������ ������ �̿��ؼ� ��� ���Ѵ�.
		avg = (double)sum / jumsu.length;
		
		// �л��̸��� ���� ���� ���� ���� ���� ������ ��� ����Ѵ�.
		
		print(jumsu, name, sum, avg, title);
		
	}
	static void print(int[] jumsu, String name, int sum, double avg, String[] title) {
		System.out.println();
		System.out.println(name + " �� ����");
		for(int i =0; i<title.length; i++) {
			System.out.print(title[i]+ "\t");
		}
		System.out.println();
		for(int i =0; i<jumsu.length; i++) {
			if(i%2==0) {
			System.out.print(jumsu[i]+ "\t ");
			}
			else{
			System.out.print(jumsu[i]+ "\t");
			}
			
		}
		System.out.println();
		System.out.println(" ���� : " + sum);
		System.out.println(" ��� : " + avg);
	}

}

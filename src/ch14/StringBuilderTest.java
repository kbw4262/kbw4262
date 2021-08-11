package ch14;
import java.util.*;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		/*  ** �Ķ���� int start ���� ���۰�. �ٵ� �迭 �����̴� ���ϱ�
		 *  ** ������ 0���� 0,1,2,3,4,5 ~ �̷��� ��. start�� 3�̶�� ���������� 4��° ��ġ��.
		 *  ** �Դٰ� end ���� 5�� ���������� 4~5 ����. �����ϼ�.
		 * 
		 * StringBuilder() �⺻ �����ڷ� capacity(���� �迭ũ��)�� 16
		 * StringBuilder(int initCapacity) capacity�� �Ķ���� ũ��� �����ϴ� ������
		 * StringBuilder(String s) �Ķ���� ���ڿ��� �ʱ�ȭ
		 * StringBuilder append(String s) �Ķ���� ���ڿ��� ������ ���ڿ��� ����
		 * StringBuilder delete(int Start, int end) ���ڿ��� start ��ġ���� end-1���� ����
		 * StringBuilder insert(int offset, String s) �� ��° �Ķ���� ���ڿ� s�� ù��° �Ķ���� ���� �ִ� ��ġ�� ����
		 * StringBuilder replace(int start, int end, String s) 
		 * ���ڿ��� start ��ġ���� end������ ���� ���ڿ��� ����° �Ķ���� ���ڿ��� ��ü
		 */
		
		
		
		for(int i=0; i<3; i++) {
			System.out.println("�ܾ �Է��ϼ���");
			sb.append(sc.next());
		}
		System.out.println(sb);
		
		sb.delete(3, 5);
		System.out.println(sb);
		
		sb.insert(3, "xxx");
		System.out.println(sb);
		
		sb.replace(3, 5, "yyy");
		System.out.println(sb);
		
		sc.close();
	
	}

}

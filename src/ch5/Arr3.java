package ch5;

import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����
		int sum = 0;
		float avg = 0;
		int[] jumsu = new int[5];
		//��ĳ�� ����
		Scanner sc= new Scanner(System.in);
		//��ǥ
		System.out.println("5���� ���������� �Է��ϼ���");
		
		// ������ �Է� �� ���� ���
		for(int i=0; i<jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
			sum+=jumsu[i];//���� ���ϱ�
		}
		//��� ���ϱ�
		avg = (sum / (float)jumsu.length);
		//���
		System.out.println("���� :"+sum+"\n��� :"+avg);
	}
}

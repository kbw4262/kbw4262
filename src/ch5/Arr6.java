package ch5;

import java.util.Scanner;

public class Arr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� ����� ���� ���� ���� ������ ������ �迭����
		int[][] jumsu = new int[3][4];
		
		
		//Ÿ��Ʋ�� ����� ���ڿ� ���
		String[] title = new String[]{"����","����","����","����"};
		Scanner sc = new Scanner(System.in);
		
		// �� �迭�� ���� �� �ʱ�ȭ
		for(int i=0; i<jumsu.length; i++) {	
			for(int j=0; j<jumsu[i].length; j++) {
				jumsu[i][j]=0;
			}
		}
		// �� �迭�� ���� �� �Է�
		for(int i=0; i<jumsu.length; i++) {	
	
			System.out.println(i + "��° ���� ���� ���� ���� ���� �Է�");
			for(int j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][j] =sc.nextInt(); 
				jumsu[i][3]  += jumsu[i][j];
			}
		}
		//��� Ÿ��Ʋ ���
		for(int i=0; i<title.length; i++) {
		System.out.print(title[i]+"\t");
		}
		System.out.println("");
		System.out.println();
		//��� ���
		for(int i=0; i<jumsu.length; i++) {	
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}

package ch5;

import java.util.Scanner;

public class Arr7 {

	public static void main(String args[]) {
		
		//�� ����� �̸��� ������ �迭
		String[] name = new String[3];
		
		//�� ����� ����,����,����, ������ ������ �迭
		int[][] jumsu = new int[3][4];
		
		//�� ����� ����� ������ �迭
		float[] avg = new float[3];
		
		//Ÿ��Ʋ�� ����� ���ڿ� ���
		
		String[] title = {"�̸�", "����","����","����","����","���"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<jumsu.length; i++) {
			

			System.out.print((i+1)+"��° ����� �̸� :");
			name[i]=sc.next();
			
			jumsu[i][3]=0;
			
			for(int j=0; j<jumsu[i].length-1; j++) {
				
			System.out.print(name[i]+"��"+title[i+1]+"���� �Է�:");
			jumsu[i][j] = sc.nextInt();
			jumsu[i][3] += jumsu[i][j];
			}
			
			avg[i] = jumsu[i][3] / (float)(jumsu[i].length-1);
			System.out.println();
		}
		
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
			
			for(int j=0; j<jumsu[i].length; j++) {
			System.out.print(jumsu[i][j] + "\t");
			}
			System.out.println(String.format("%.1f",avg[i]));
		}
	}
}

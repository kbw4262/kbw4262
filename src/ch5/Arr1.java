package ch5;

import java.util.Scanner;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("�ʱ�ȭ�� �� ���");
			
			int intArry[] = new int[] {1,2,3,4,5};
			
			for(int i=0; i<intArry.length; i++) {
				System.out.println(intArry[i]);
			}
			
			System.out.println("");
			
			
			
			
			int arr[] = new int[5]; // �迭 ������ ���� ���ÿ�
			int arr2[];   // �迭 ����
			int[] arr3;   // �迭 ���� �ٸ� ����
			// int arr4[] = new int[]; �����迭�� �迭 ������ �� �ε����� �� �־�����. 
			
			for(int i =0; i<arr.length; i++) {
				arr[i] = i+1;

				System.out.println(arr[i]);
			}
			
			
			
			
			System.out.println("");
			arr[3]= 1392;		// ���� �迭 �󿡼� �� �ε����� ���� ���� �����ؼ� �ִ� ���
			for(int i =0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}			
			
			
			
			
	}

}

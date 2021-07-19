package ch5;

import java.util.Scanner;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("초기화된 값 출력");
			
			int intArry[] = new int[] {1,2,3,4,5};
			
			for(int i=0; i<intArry.length; i++) {
				System.out.println(intArry[i]);
			}
			
			System.out.println("");
			
			
			
			
			int arr[] = new int[5]; // 배열 생성과 선언 동시에
			int arr2[];   // 배열 선언만
			int[] arr3;   // 배열 선언 다른 버전
			// int arr4[] = new int[]; 정적배열은 배열 생성할 때 인덱스를 꼭 넣어주자. 
			
			for(int i =0; i<arr.length; i++) {
				arr[i] = i+1;

				System.out.println(arr[i]);
			}
			
			
			
			
			System.out.println("");
			arr[3]= 1392;		// 정적 배열 상에서 한 인덱스에 직접 값을 저격해서 넣는 방법
			for(int i =0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}			
			
			
			
			
	}

}

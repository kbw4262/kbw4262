package ch5;

import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int sum = 0;
		float avg = 0;
		int[] jumsu = new int[5];
		//스캐너 선언
		Scanner sc= new Scanner(System.in);
		//목표
		System.out.println("5명의 수학점수를 입력하세요");
		
		// 점수값 입력 및 총점 계산
		for(int i=0; i<jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
			sum+=jumsu[i];//총점 구하기
		}
		//평균 구하기
		avg = (sum / (float)jumsu.length);
		//출력
		System.out.println("총점 :"+sum+"\n평균 :"+avg);
	}
}

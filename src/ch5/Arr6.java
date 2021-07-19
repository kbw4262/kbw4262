package ch5;

import java.util.Scanner;

public class Arr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//세 사람의 국어 영어 수학 총점을 저장할 배열생성
		int[][] jumsu = new int[3][4];
		
		
		//타이틀로 사용할 문자열 목록
		String[] title = new String[]{"국어","영어","수학","총점"};
		Scanner sc = new Scanner(System.in);
		
		// 각 배열의 원소 값 초기화
		for(int i=0; i<jumsu.length; i++) {	
			for(int j=0; j<jumsu[i].length; j++) {
				jumsu[i][j]=0;
			}
		}
		// 각 배열의 원소 값 입력
		for(int i=0; i<jumsu.length; i++) {	
	
			System.out.println(i + "번째 행의 국어 영어 수학 점수 입력");
			for(int j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][j] =sc.nextInt(); 
				jumsu[i][3]  += jumsu[i][j];
			}
		}
		//결과 타이틀 출력
		for(int i=0; i<title.length; i++) {
		System.out.print(title[i]+"\t");
		}
		System.out.println("");
		System.out.println();
		//결과 출력
		for(int i=0; i<jumsu.length; i++) {	
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}

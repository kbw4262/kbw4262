package ch5;

import java.util.Scanner;

public class Arr7 {

	public static void main(String args[]) {
		
		//세 사람의 이름을 저장할 배열
		String[] name = new String[3];
		
		//세 사람의 국어,영어,수학, 총점을 저장할 배열
		int[][] jumsu = new int[3][4];
		
		//세 사삼의 평균을 저장할 배열
		float[] avg = new float[3];
		
		//타이틀로 사용할 문자열 목록
		
		String[] title = {"이름", "국어","영어","수학","총점","평균"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<jumsu.length; i++) {
			

			System.out.print((i+1)+"번째 사람의 이름 :");
			name[i]=sc.next();
			
			jumsu[i][3]=0;
			
			for(int j=0; j<jumsu[i].length-1; j++) {
				
			System.out.print(name[i]+"의"+title[i+1]+"점수 입력:");
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

package KBW_test;
import java.util.*;

public class JumsuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] jumsu = new int[4];
		String[] title = new String[] {"국어", "영어", "수학", "과학"};
		int sum = 0; 	// 점수 총점
		double avg = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		// 이름을 입력받아 변수에 저장한다.
		
		System.out.print("이름을 입력하시오 : ");
		name = sc.next();
		
		//4과목을 입력받아 저장한다 ( 국어,영어,수학,과학 )
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(title[i]+"의 점수를 입력해주세요 : ");
			jumsu[i] = sc.nextInt();

			//배열에 저장된 과목의 점수를 이용해서 총점 구한다.
			sum += jumsu[i];
		}
		
		//배열에 저장된 과목의 점수를 이용해서 평균 구한다.
		avg = (double)sum / jumsu.length;
		
		// 학생이름과 국어 영어 수학 과학 점수 총점과 평균 출력한다.
		
		print(jumsu, name, sum, avg, title);
		
	}
	static void print(int[] jumsu, String name, int sum, double avg, String[] title) {
		System.out.println();
		System.out.println(name + " 의 점수");
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
		System.out.println(" 총점 : " + sum);
		System.out.println(" 평균 : " + avg);
	}

}

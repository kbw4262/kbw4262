package ch14;
import java.util.*;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		/*  ** 파라메터 int start 값은 시작값. 근데 배열 개념이다 보니깐
		 *  ** 시작이 0부터 0,1,2,3,4,5 ~ 이렇게 됨. start가 3이라면 실질적으로 4번째 위치임.
		 *  ** 게다가 end 값이 5면 실질적으로 4~5 값임. 주의하셈.
		 * 
		 * StringBuilder() 기본 생성자로 capacity(내부 배열크기)는 16
		 * StringBuilder(int initCapacity) capacity를 파라메터 크기로 지정하는 생성자
		 * StringBuilder(String s) 파라메터 문자열로 초기화
		 * StringBuilder append(String s) 파라메터 문자열을 원래의 문자열에 연결
		 * StringBuilder delete(int Start, int end) 문자열의 start 위치에서 end-1까지 삭제
		 * StringBuilder insert(int offset, String s) 두 번째 파라메터 문자열 s을 첫번째 파라메터 값에 있는 위치에 삽입
		 * StringBuilder replace(int start, int end, String s) 
		 * 문자열의 start 위치에서 end까지의 하위 문자열을 세번째 파라메터 문자열로 교체
		 */
		
		
		
		for(int i=0; i<3; i++) {
			System.out.println("단어를 입력하세요");
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

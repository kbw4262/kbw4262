package ch8;

public class localTest {

	int memVar; // 멤버변수
	
	void localVar() {
		
		int a = 10, c;
		{
			int b= 20;
			System.out.println("블록안");
			System.out.println(" a + b = " + (c=a+b) );
			
			
		}
		
//		System.out.println("b = "+ b); // 에러 발생

		int b =30; 
		System.out.println(" 블록 밖 ");
		System.out.println("a = "+ a+ ", b = "+b);
		
		//memVar숫자형 멤버변수는 0으로 자동 초기화
		
		System.out.println("값 할당 전의 memVar = " + memVar);
		memVar = 100;
		System.out.println("값 할당 후의 memVar = " + memVar);
		
	}
	
	
	void printVar() {
		
		System.out.println("memVar = "+ memVar);
		//System.out.println("a = " +a+ " ,b = "+b);
	}
	
	
}

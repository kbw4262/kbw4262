package ch9;

public class InitTest {

	int x = 5;
	static int y = 5; // static 변수
	
	String str = "aaa";
	
	static { // 정적변수(static변수) 초기화
		System.out.println("static 변수 초기화 전 \ny : " + y);
		y =10;
	}
	{	// 초기화 블록
		System.out.println("초기화 블록 실행 전 \nx : "+ x);
		System.out.println("y = " + y);
		System.out.println("str = "+str);
		x= 20;
		y= 20;
		str = "bbb";
		
	}
	InitTest(){ // 생성자
		System.out.println("생성자 실행전 \nx = "+x);
		System.out.println("y = "+y);
		x=30;
		y=30;
		str = "ccc";
		
	}
	void print() {
		System.out.println("모든 초기화 후 \nx = "+x);
		System.out.println("y = "+y);
		System.out.println("str = "+str);
	}
	
	
}

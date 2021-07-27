package ch9;

public class InitMethod {

	int x = initMember(); // 멤버변수 x에 초기값으로 메서드의 리턴값 할당.
	static int y = initMember_s();
	// static 멤버 변수를 선언 - 초기값은 초기화 메서드가 반환하는 값으로 할당
	
	final int initMember() { // 오버라이딩을 금지하는 키워드 -오버로딩 과 다름
		return 10;
	}
	static int initMember_s() { // 초기화 메서드
		return 10;
	}
	
	
	InitMethod() {
		//생성자, 모든 멤버를 20으로 초기화.
		System.out.println("생성자 실행전");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		x = 20;
		y = 20;
		
	}
	
	
	void print() {
		System.out.println("생성자 실행후");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	}
	
}

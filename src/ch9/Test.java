package ch9;

public class Test {

	int add_int(int x, int y) {
		return x+y;
	}
	
	float add_float(float x, float y) {
		return x+y;
	}
	
	String add_String(String x, String y) {
		return x+y;
	}
	
	int add_int(int x, int y, int z) {
		return x+y+z;
	} // 메서드 오버로딩 ** 클래스, 변수, 메서드 등의 이름을 만드는 규칙 : 이미 사용된 이름을 또 선언하면 안된다.
	  // 이름은 동일하지만 파라메터의 개수나 타입을 다르게 하여 무엇을 호출했는지 구분
	
	void add_int() {
		System.out.println(" 더하기! ");
	}
	
	
	
}

package ch13;

public class Child extends Parent { // 할아버지까지 다 상속받음.

	public String hobby;
	
	@Override
	public void print() { // parent 에서 구현한 print 를 Child에 맞게 재정의
		System.out.println("Child");
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}
	@Override
	public void test() {	 // 상속받은 추상 메서드 test 구현
		System.out.println("hobby = " + hobby );
		
	}
	
	// 새로운 메서드. 재정의를 하는게 아니기 때문에 Override를 작성하지않는다.
	public void parentPirnt() {
		super.print(); // 이 클래스에서 재정의한 상위 클래스의 메서드를 호출
		// 재정의된 상위클래스의 메서드를 하위 클래스에서 호출하려면 super를 이용
	}
	
}

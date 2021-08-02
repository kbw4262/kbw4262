package ch13;
 public abstract class GrandParent {
	 
	 protected String name;
	 protected int age;
	 
	 public abstract void print(); // 추상 메서드
	 public abstract void test();  // 추상메서드
	 
	 /*
	  * 이 클래스는 추상메서드를 포함하고 있어서
	  * 추상클래스이며 객체를 생성 할 수 없다.
	  */
	 
}

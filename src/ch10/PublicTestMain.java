package ch10;

public class PublicTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicTest t = new PublicTest(10,10);
		t.x = 20; // x는 public 이라서 밖에서 접근 가능
		//t.y = 30;
		//t.setValue private 메서드라 안보임...
		t.print();
	}

}

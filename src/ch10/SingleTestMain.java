package ch10;

public class SingleTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 못한다. SingleTest s = new SingleTest();
		// 생성자가 private 이기 때문에 클래스 밖에서 객체생성이 불가능하다.
		
		SingleTest s = SingleTest.getSingleTest();
		// get 을 호출해서 SingTest 클래스 내에서 생성한
		// 객체를 반환 받아서 사용한다.
		
		/*객체를 한개 만들때 사용하는 싱글톤 기법이다.
		 * 클래스에서 멤버변수 static SingleTest s 할당해주고
		 * 그것을 메인에서 getSingleTest로 호출해주는거라서
		 * 객체가 하나만 생성할때만 쓰이는 기법
		 * 실무에서는 잘 안쓴다고 한다. 머..나는 모르지 뭐..
		 */
		
		
		s.print();
		
	}

}

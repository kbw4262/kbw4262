package ch13;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandParent gp = new Child(); // 업캐스팅
		gp.name = "grand papa";
		gp.age = 90;
		//gp.hobby = "go";
		//hobby는 GrandParent의 데이터 타입이 아니라서 정의 불가.
		gp.print();
		gp.test();
		
		/*
		 * GrandParent 자체로는 객체생성이 불가능하다.
		 * 하지만 업캐스팅으로 하위클래스(Child)에서 실행되면서 
		 * GrandParent의 데이터 타입만 불러오는 형식으로 실행 가능.
		 */
		
		System.out.println("---------------");
		
		
		
		Child c = new Child(); // 그냥 생성.
		c.name = "Child momo";
		c.age = 10;
		c.hobby = "study";
		c.print();
		c.test();
		
		System.out.println("---------------");
		
		c.parentPirnt(); // parentPrint() 를 호출해 상위클래스(parent)의 print()를 호출
		// super로 상위 클래스의 print()를 소환한 것이다.
		

		
		
	}

}

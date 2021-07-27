package ch12;

public class UpCastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("UpCastingParent 객체");
		UpCastingParent up  = new UpCastingParent();
		System.out.println("up.add = "+ up.add());
		System.out.println();
		
		System.out.println("UpCastingChild 객체");
		UpCastingChild uc = new UpCastingChild();
		System.out.println("uc.add = " + uc.add());
		System.out.println("uc.sub = " + uc.sub());
		System.out.println();
		
		System.out.println("UpCasting 된 객체");
		UpCastingParent upc;  // "Parent"
		//업캐스팅 객체를 생성, 타입은 부모클라스인 UpCastingParent이고
		upc = new UpCastingChild();  // Child
		// 생성자 호출은 자식클래스인 UpCastingChild에서 호출
		System.out.println("upc.add = "+ upc.add());
		//System.out.println("upc.sub = "+_upc.sub());
		/*
		 * sub()호출하는데, upc 타입은 UpCastingParent라서
		 * 이 클래스에는 sub()이 정의 되어있지 않다. 그래서 에러 발생
		 * 이처럼 타입은 부모, 실행되는 형태는 자식인것을 업캐스팅이라고 함.
		 * 
		 *  -> 근데 메서드 호출하는 번지가 부모인데 뭐지..?
		 */
	}

}

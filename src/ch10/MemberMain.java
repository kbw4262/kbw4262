package ch10;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m = new Member();
		m.setName("구본우");
		m.setTel("080-500-4949");
		m.setAddress("서울시 중랑구");
		System.out.println("이름 : " + m.getName());
		System.out.println("전화번호 : "+m.getTel());
		System.out.println("주소 : "+ m.getAddress());
		
		Member m2 = new Member("김병찬", "111-111-1111", "광진구");
		m2.print();
		
		
		
	}

}

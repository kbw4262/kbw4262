package ch10;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m = new Member();
		m.setName("������");
		m.setTel("080-500-4949");
		m.setAddress("����� �߶���");
		System.out.println("�̸� : " + m.getName());
		System.out.println("��ȭ��ȣ : "+m.getTel());
		System.out.println("�ּ� : "+ m.getAddress());
		
		Member m2 = new Member("�躴��", "111-111-1111", "������");
		m2.print();
		
		
		
	}

}

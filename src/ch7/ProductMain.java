package ch7;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.num = 1;
		p1.name = "��Ʈ��";
		
		Product p2 = new Product();
		p2.num = 2;
		p2.name = "TV";
		
		System.out.println("��ü p1�� ���� ���");
		System.out.println("p1�� ���� : "+p1.num+" / "+p1.name);
		System.out.println("��ü p2�� ���� ���");
		System.out.println("p2�� ���� : "+p2.num+" / "+p2.name);
		p1.print();
		p2.print();
		
		
		
		
	}

}

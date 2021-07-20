package ch7;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.num = 1;
		p1.name = "노트북";
		
		Product p2 = new Product();
		p2.num = 2;
		p2.name = "TV";
		
		System.out.println("객체 p1의 정보 출력");
		System.out.println("p1의 정보 : "+p1.num+" / "+p1.name);
		System.out.println("객체 p2의 정보 출력");
		System.out.println("p2의 정보 : "+p2.num+" / "+p2.name);
		p1.print();
		p2.print();
		
		
		
		
	}

}

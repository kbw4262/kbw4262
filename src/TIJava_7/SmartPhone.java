package TIJava_7;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 하는 중");
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("안녕여러분?");
	}

	
	
}

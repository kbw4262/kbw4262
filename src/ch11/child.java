package ch11;

public class child extends Parent {
	
	private String hobby;
	public child() {
		System.out.println(" child 생성자 ");
	}
	public void printInfo() {
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
		//System.out.println("money : " + money); 에러 발생
		System.out.println();
		
		
	}
	
	

}

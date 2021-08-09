package TIJava_7;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Phone p = new Phone();
		
		SmartPhone sp = new SmartPhone("홍길동"); // 생성자에서  
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		sp.print();
	}

}

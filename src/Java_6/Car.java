package Java_6;

public class Car {

	//�ʵ�
	String model;
	int speed;
	
	//������
	public Car(){}
	Car(String model){
		this.model = model;
	}
	
	//�޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		for(int i=0; i<=50; i+= 10) {
			this.setSpeed(i);
			System.out.println(model + " �޸��ϴ�. (�ü� : " + this.speed+" km/h)");
		}
	}
	
	
	
}

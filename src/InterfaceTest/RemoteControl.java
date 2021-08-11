package InterfaceTest;

public interface RemoteControl {
	
	int MAX_VOL = 10;
	int MIN_VOL = 0;

	void turnOff();
	void turnOn();
	void setVol(int vol);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó�� �մϴ�.");
		}else {
			System.out.println("���� ���� �մϴ�.");
		}
	}
	static void ChangeBattery() {
		System.out.println("�������� ��ü�մϴ�");
	}
}

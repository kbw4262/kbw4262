package InterfaceTest;

public interface RemoteControl {
	
	int MAX_VOL = 10;
	int MIN_VOL = 0;

	void turnOff();
	void turnOn();
	void setVol(int vol);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	static void ChangeBattery() {
		System.out.println("건전지를 교체합니다");
	}
}

package InterfaceTest;

public class Audio implements RemoteControl{

	private int vol;
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void setVol(int vol) {
		// TODO Auto-generated method stub
		if(vol>MAX_VOL) {
			this.vol = RemoteControl.MAX_VOL;
		}
		else if(vol<MIN_VOL) {
			this.vol = RemoteControl.MIN_VOL; 
		}
		else {
			this.vol = vol;
		}
		
		System.out.println("���� Audio ���� : " + this.vol);
	}
	
	
}

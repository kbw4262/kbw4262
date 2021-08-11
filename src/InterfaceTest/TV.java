package InterfaceTest;

public class TV implements RemoteControl{
	private int vol;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
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
		
		System.out.println("ÇöÀç TV º¼·ý : " + this.vol);
	}

	
}

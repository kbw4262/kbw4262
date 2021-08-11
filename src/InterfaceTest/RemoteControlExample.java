package InterfaceTest;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new TV();
		rc.turnOn();
		rc.turnOff();
		for(int i= -5; i<15; i++) {
			rc.setVol(i);		
		}
		rc.setMute(true);
		rc.setMute(false);
		
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		for(int i= -5; i<15; i++) {
			rc.setVol(i);		
		}
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl hl = new RemoteControl() {
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVol(int vol) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
		
	}

}

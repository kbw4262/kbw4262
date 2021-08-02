package ch13.game;

public abstract class Character {
	protected int hp;
	protected int level = 0;
	protected int energy;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	public boolean checkEnergy() {
		if(energy <= 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void printInfo(){
		System.out.println("현재 캐릭터의 정보 출력");
		System.out.println("hp = " + hp);
		System.out.println("energy = "+ energy);
		System.out.println("level = "+ level);
		
	}
	
}

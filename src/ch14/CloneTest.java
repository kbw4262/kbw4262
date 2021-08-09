package ch14;

public class CloneTest implements Cloneable{ // 인터페이스 상속
	public int x;
	public int y;
	
	
	@Override // clone 재정의
	protected Object clone() throws CloneNotSupportedException{ // 예외처리
		return super.clone();
	}
	

}

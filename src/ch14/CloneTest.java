package ch14;

public class CloneTest implements Cloneable{ // �������̽� ���
	public int x;
	public int y;
	
	
	@Override // clone ������
	protected Object clone() throws CloneNotSupportedException{ // ����ó��
		return super.clone();
	}
	

}

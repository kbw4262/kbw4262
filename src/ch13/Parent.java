package ch13;

public abstract class Parent extends GrandParent{

	// �� ���� �߻� �޼��带 ��� �޾ұ� ������ �ΰ� ��� �����ؾ� �ϼ��� Ŭ������ �ȴ�.
	
	/*public void print() {}
	public void test() {}
	public void parentPirnt() {}
	*/
	
	@Override // ������ ������̼�
	public void print() {
		System.out.println("parent");
		System.out.println("name = " + name);
	}
	// �׷��� print �� ���� ���� �����Ƿ�
	// parent�� �߻� Ŭ�����̸�, ��ü�� ���� �� ����.
}

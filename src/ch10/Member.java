package ch10;

public class Member {
	
	private String name; // ����� ��� private,  ���� Ŭ������ ���������
	private String tel;	 // private���� ������ �ܺη� ������ ����
	private String address; // �����Ǵ� ���� ���´�

	public void printMember() {  //public �̶� Ŭ���� �ۿ��� ȣ�� ����
		System.out.println("name = "+ this.name);
		System.out.println("tel = "+ this.tel);
		System.out.println("address = "+ this.address);
	}
	Member(){}

	Member(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address; 
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}public String getAddress() {
		return this.address;
	}
	public void setAddress(String Address) {
		this.address = address;
	}
	void print() {

		System.out.println("�̸� : " + this.name);
		System.out.println("��ȭ��ȣ : "+this.tel);
		System.out.println("�ּ� : "+ this.address);
		
		
	}


}

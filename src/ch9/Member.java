package ch9;

public class Member {

	// ������ ����.
	// �����ڴ� Ŭ������ �̸��� �����ؾ��Ѵ�
	String name;
	String tel;
	String address;
	
	Member(){
		name = "no name";
		tel = "no tel";
		address = " no address";
	}
	
	void setMemberData(String _name, String tel, String _address) {
		name =_name;
		this.tel = tel;
		this.address = _address;
	}
	void print(){
		System.out.println(" name : "+this.name);
		System.out.println(" tel : "+this.tel);
		System.out.println(" address : "+this.address);
		
	}  
	
	
}

package ch9;

public class Member {

	// 생성자 생성.
	// 생성자는 클래스랑 이름이 동일해야한다
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

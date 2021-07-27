package ch10;

public class Member {
	
	private String name; // 멤버는 모두 private,  보통 클래스의 멤버변수는
	private String tel;	 // private으로 지정해 외부로 정보가 직접
	private String address; // 공개되는 것을 막는다

	public void printMember() {  //public 이라서 클래스 밖에서 호출 가능
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

		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : "+this.tel);
		System.out.println("주소 : "+ this.address);
		
		
	}


}

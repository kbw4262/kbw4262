package ch12;

public class Child extends Parent {

		private String hobby;
		
		@Override // 재정의 어노테이션으로 컴파일러에 상속받은 매서드를 재정의함을 알려줌
		// 협업 할 때 써주는게 예의임..... 
		public void printInfo() {
			System.out.println("name : "+ name);
			System.out.println("hobby : "+ hobby);
		}
		public String getHobby() {
			return hobby;
		}
		
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		
	
}

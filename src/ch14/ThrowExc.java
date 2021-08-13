package ch14;

public class ThrowExc {

	String str = null; // 이 클래스의 str.
	// 메서드 subStr()은 멤버변수 str을 파라메터 idx 위치부터 잘라낸다.
	// 그래서 문자열 처리 전 str이 null인지를 확인하고 null이면 예외를 발생하고
	// null 이 아니면 문자를 idx만큼 잘라내어 리턴한다.
	
	public String subStr(int idx) {
		if(str == null) {
			System.out.println("str이 null이다.");
			throw new NullPointerException(); 
			// str이 null이면 NullPointerExection 객체를 생성하여 던진다.
			// 이 예외 객체는 런타임 시스템으로 전달되고, 시스템은 핸들러를 찾아 실행.
		}else {
			return str.substring(idx);
		}
	}
	
	
}

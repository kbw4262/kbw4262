package ch14;

public class ThrowExcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowExc te = new ThrowExc(); // ThrowExc 객체 (te)를 생성.
		String str = te.subStr(2); // subStr()호출. 
		System.out.println(str); // 하지만 str은 null이기 때문에 예외가 발생.
	}

}

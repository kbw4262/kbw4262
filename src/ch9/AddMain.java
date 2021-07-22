package ch9;

public class AddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		
		System.out.println("int 형 param 2개의 add() 호출 :" + t.add_int(2, 3));
		System.out.println("int 형 param 3개의 add() 호출 :" + t.add_int(2, 3, 4));
		System.out.println("float 형 param 2개의 add() 호출 :" + t.add_float(5.1f, 7.4f));
		System.out.println("String 형 param 2개의 add() 호출 :" + t.add_String("ㅎㅎ", "ㅋㅋ"));
		
		
	}

}

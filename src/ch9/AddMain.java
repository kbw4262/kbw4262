package ch9;

public class AddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		
		System.out.println("int �� param 2���� add() ȣ�� :" + t.add_int(2, 3));
		System.out.println("int �� param 3���� add() ȣ�� :" + t.add_int(2, 3, 4));
		System.out.println("float �� param 2���� add() ȣ�� :" + t.add_float(5.1f, 7.4f));
		System.out.println("String �� param 2���� add() ȣ�� :" + t.add_String("����", "����"));
		
		
	}

}

package ThisIsJava;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String str = null;
			System.out.println(str);
			
			if(str == null) {

				System.out.println("str¿Ã null¿Ã¥Ÿ.");
				throw new NullPointerException();
			}
			else {
				System.out.println(str);
			}
	}

}

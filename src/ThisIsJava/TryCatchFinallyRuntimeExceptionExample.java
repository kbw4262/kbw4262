package ThisIsJava;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = null;
		String str2 = null;
		
		try {
			str1 = args[0];
			str2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		
		
		try {
			int val1 = Integer.parseInt(str1);
			int val2 = Integer.parseInt(str2);
			int result = val1 + val2;
			System.out.println(result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행 하세요");
		}
		
	}

}

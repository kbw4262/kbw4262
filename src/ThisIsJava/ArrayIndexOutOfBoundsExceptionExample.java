package ThisIsJava;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		String data1 = args[0]; // Run - > Run Configueations -> Arguments 탭에서 
		String data2 = args[1]; // Program arguments 입력란에 아무것도 없음.
								// 즉, 실행 매개값이 없으니깐 얼마큼의 배열의 길이가 있는지 정해지지않아 예외
		System.out.println("args[0]" + data1);
		System.out.println("args[1]" + data2);
		*/
		
		// 예외 처리
		
		if(args.length == 2) {
			String str1 = args[0]; 
			String str2 = args[1]; 
									
			System.out.println("args[0]" + str1);
			System.out.println("args[1]" + str2);
			
		}
		else {
			System.out.println("[실행방법]");
			System.out.println("Java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1, 값2");
		}
		
		
		
		
	}
	

}

package ThisIsJava_4;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="신민철";
		String str2 ="신민철";
		if(str1 == str2) {
			System.out.println(" str1 과 str2 의 참조가 같음");
			
		}
		else {
			System.out.println(" str1 과 str2 의 참조가 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println(" str1 과 str2 의 문자열이 같음");
		}
		else {
			System.out.println(" str1 과 str2 의 문자열이 다름");
		}
		
		String str3 = new String("신민철");
		String str4 = new String("신민철");
		
		if(str3 == str4) {
			System.out.println(" str3 과 str4 의 참조가 같음");
			
		}
		else {
			System.out.println(" str3 과 str4 의 참조가 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println(" str3 과 str4 의 문자열이 같음");
		}
		
		
		
	}

}

package ch14;

public class StringConvert {

	public static void main(String[] args) {
		//String 생성 실습
		String str1 = "Hello";
		String str2 = new String("java");
		char[] arr = {'g','o','o','d'};
		String str3 = new String(arr);
		String str4	= new String();
		str4 = str1 + " " + str2 + " " + str3;
		System.out.println(str4);
		
		//String을 그 타입 숫자로 변환
		String s_i = "123";
		String s_f = "23.5";
		String s_d = "234.567";
		int i = Integer.valueOf(s_i).intValue();
		float f = Float.valueOf(s_f).floatValue();
		double d = Double.valueOf(s_d).doubleValue();
		/*
		 * 숫자형 문자열을 valueOf() 메서드를 이용해 숫자로 변환
		 * valueOf()는 그 래퍼 클래스 객체(Integer이면 Integer 객체)를 반환하므로
		 * 기본 타입으로 변환하는 intValue()로 한번 더 처리해야 한다.
		 * 
		 *  내가 이해하려고 적음 - > 기본타입 int, double, float  같은게 있는데
		 *  String 은 기본 타입이 아니라 클래스임. 
		 *  즉, 객체 형태로 저장되어있는 상태임.
		 *  그걸 기본타입으로 변환해주려면 래퍼클래스 Integer.valueOf(s_i)로 
		 *  숫자형태의 문자열을 그 타입의 숫자로 변환(int) 먼저 해준다는 소리.
		 *  그 상태에서 클래스를 기본타입으로 변환하는 과정 "언박싱"을 해줘야한다는 소리.
		 */
		System.out.println(" String 의 합 : " + s_i + s_f + s_d);
		System.out.println(" 숫자의 합 = " + (i+f+d));
		
		//String을 숫자로 변환
		int x = Integer.parseInt("123");
		float y = Float.parseFloat("23.5");
		System.out.println("x + y = " +(x+y));
		
		//숫자를 String으로 변환
		System.out.println("x + y" + x + y);
		String str5 = String.valueOf(x); // 숫자를 문자열로 변환.
		System.out.println(str5+8);
		System.out.println(8 + str5);
		
		//숫자형 래퍼 클래스의 toString()을 이용해 래퍼 클래스의 기본타입 값을 문자열로 변환
		String str6 = Integer.toString(i);
		String str7 = Float.toString(f);
		String str8 = Double.toString(d);
		System.out.println("str6 = " +  str6);
		System.out.println("str7 = " +  str7);
		System.out.println("str8 = " +  str8);
				
		
		
		
	}
}

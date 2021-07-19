package ch4;
import java.util.*;
import java.math.*;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			byte byteValue = 10;
			int intValue = byteValue;
			System.out.println(intValue); // 작은 것에서 큰거는 자동으로 형변환이 된다.
			byteValue = (byte)intValue;
			System.out.println(byteValue); // 큰것에서 작은 것으로 형변환은 강제로 해줘야한다.
			
			char charValue = '가';
			intValue = charValue;
			System.out.println("가의 유니코드 = "+ intValue);
			
			long longValue = intValue;
			float floatValue = intValue;	 // float는 같은 4비트여도 부동소수점 표현때문에 int 보다는 크기가 크다.
			double doubleValue = intValue;   // double도 그릇이 크기때문에 강제 형변환이 필요가 없다.
			
			System.out.println(longValue);
			System.out.println(floatValue);
			System.out.println(doubleValue);
			
			double d = -2.49999999999;
			int a =(int)d;
			System.out.println(a);
			byte b = 125;
			System.out.println(b++);
			System.out.println(b++);
			System.out.println(b++);
			System.out.println(b++);
			System.out.println(b++);
			
			
			int aa = 1234567890;
			System.out.println(aa);
			float bb = 1234567;
			System.out.println(bb);
			
			System.out.println(Short.MAX_VALUE);
			
			
	}

}

package ch4;
import java.util.*;
import java.math.*;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			byte byteValue = 10;
			int intValue = byteValue;
			System.out.println(intValue); // ���� �Ϳ��� ū�Ŵ� �ڵ����� ����ȯ�� �ȴ�.
			byteValue = (byte)intValue;
			System.out.println(byteValue); // ū�Ϳ��� ���� ������ ����ȯ�� ������ ������Ѵ�.
			
			char charValue = '��';
			intValue = charValue;
			System.out.println("���� �����ڵ� = "+ intValue);
			
			long longValue = intValue;
			float floatValue = intValue;	 // float�� ���� 4��Ʈ���� �ε��Ҽ��� ǥ�������� int ���ٴ� ũ�Ⱑ ũ��.
			double doubleValue = intValue;   // double�� �׸��� ũ�⶧���� ���� ����ȯ�� �ʿ䰡 ����.
			
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

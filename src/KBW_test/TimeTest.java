package KBW_test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		format1 = new SimpleDateFormat ( "yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
				
		Date time = new Date();  // java.util 임.. sql 아님..
				
		String time1 = format1.format(time);
		String time2 = format2.format(time);
				
		System.out.println(time1);
		System.out.println(time2);
		
		int value = 356;
		System.out.println(value - (value%100));
		System.out.println((double)((5+10)*7)/2);
		
		
		int b= 3, sum = 0; 
		int i=0;
		while(sum != 1683) {
			sum += b * i;

			System.out.println("3의 배수의 합 :" + sum + " i :" + i);
			i++;
		}
		System.out.println("3의 배수의 합 :" + sum + " i :" + i);

	}

}

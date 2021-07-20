package ch7;

import java.text.DecimalFormat;
import java.util.*;

public class Student {

	String name=null;
	int kor=0;
	int eng=0;
	int math=0;
	int sum=0;
	float avg=0;
	
	void eval_sum() {
		sum = kor + eng + math;
	}
	void eval_avg() {
		avg = (float)sum /3;
	}
	
	void print() {
		DecimalFormat form = new DecimalFormat("#.#");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		System.out.println("���� : "+sum);
		System.out.println("��� : "+ form.format(avg));
		
		System.out.println();
	}

}

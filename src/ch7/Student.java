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
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+ form.format(avg));
		
		System.out.println();
	}

}

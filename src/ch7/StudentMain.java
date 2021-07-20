package ch7;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "±Ë≈¬»Ò";
		s1.kor = 81;
		s1.eng = 95;
		s1.math = 100;
		
		//s1.sum = s1.kor + s1.eng + s1.math;
		//s1.avg = s1.sum / 3;
		s1.eval_sum();
		s1.eval_avg();
		s1.print();
		
		s2.name = "¿Âµø∞«";
		s2.kor = 90;
		s2.eng = 76;
		s2.math = 90;
		
		s2.eval_sum();
		s2.eval_avg();
		s2.print();
		
		
	}

}

package ThisIsJava_4;

public class ArrayCreateByValueListExample1 {
	static int scores[] = {83,90,87};
	
	static void print(int i) {
		System.out.println("score[i] : "+ scores[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(0);
		print(1);
		print(2);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		System.out.println("ÃÑÇÕ : "+ sum);
		double avg = sum / 3.0;
		System.out.println("Æò±Õ : " + String.format("%.1f", avg));
	}

}

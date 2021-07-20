package KBW_test;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				sum = (4*i) + (5*j);
				if(sum == 60) {
					System.out.println("("+i+" , "+j+" )");
					
				}
				
			}
			
		}
		
		
	}

}

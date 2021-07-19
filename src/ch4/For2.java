package ch4;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int cnt = 0;
		System.out.println("1~100까지 홀수");
		for(int i=0; i<100; i++) {
			if(i%2 != 0) {
			
			a = i;
			cnt++;
			System.out.print("합 = "+a+"\t");
			}
			if(i%10 == 0) {
				System.out.println("");
			}
			
		}
		System.out.println("");
		System.out.println(cnt);
	}

}

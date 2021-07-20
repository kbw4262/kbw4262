package AlSong;

public class Q5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Q5 q5 =new Q5();
		
		q5.setSum(5);
		q5.avg = 3;
		//System.out.println("q5 sum : "+q5.sum); error
		System.out.println("q5 sum :" + q5.getSum());
		q5.print();
		int i =10;
		do {
		System.out.println(i);
		i++;
		}while(i==10); // 참이면 while문 돌아감
		System.out.println();
		
		i=0;
		while(i<10) { // 참이면 while문 돌아감
			
			System.out.println(i);
			i++;
		}
		
	}

}

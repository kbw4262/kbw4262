package AlSong;

public class Q6_2 {

	int[] print() {

		int[] arr = new int[5];
		for(int i=5; i>0; i--) {
			arr[i-1] = i;
			System.out.println("�迭 arr["+i+"] : "+ arr[i-1]);
		}
		return arr;
	}
	
	int[] add(int[] arr) {
		
		int[] sum =new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			sum[i]  = arr[i];
			
			System.out.println("sum "+i+" �� ���� : " +sum[i]);
			System.out.println("arr2 "+i+" �� ���� : " +arr[i]);
			}
		
		
		
		
		return sum;
	}
	
	
	public static void main(String[] args) {
	
		Q6_2 q = new Q6_2();
		q.print();
		
		
		Q6_2 q2 = new Q6_2();
		q2.add(q.print());
		
		
		
		
		
	}
	
}

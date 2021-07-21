package ch8;

public class ArrParam {

	int max;     // 멤버변수들
	int sum;
	float avg;
	
	void makeMax(int[] arr) { // 배열 요소 중 가장 큰 값을 찾아 멤버 변수 max에 저장
		max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
	}
	
	
	//파라메터로 전달받은 배열의 총합을 계산해서 sum에 저장
	
	void makeSum(int[] arr) {
		sum =0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
	}
	
	//파라메터로 전달받은 배열의 평균을 계산해서 avg에 저장.
	
	void makeAvg(int[] arr) {
		avg = 0;
		for(int i=0; i<arr.length; i++) {
			avg = (float)sum / arr.length;
		}
		
	}
	
	void print(int i) {
		System.out.println("arr"+i+"의 max = " + max);

		System.out.println("arr"+i+"의 sum = " + sum);

		System.out.println("arr"+i+"의 avg = " + avg);
		
	}
	
	
	
}

package ch8;

public class ArrParam {

	int max;     // ���������
	int sum;
	float avg;
	
	void makeMax(int[] arr) { // �迭 ��� �� ���� ū ���� ã�� ��� ���� max�� ����
		max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
	}
	
	
	//�Ķ���ͷ� ���޹��� �迭�� ������ ����ؼ� sum�� ����
	
	void makeSum(int[] arr) {
		sum =0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
	}
	
	//�Ķ���ͷ� ���޹��� �迭�� ����� ����ؼ� avg�� ����.
	
	void makeAvg(int[] arr) {
		avg = 0;
		for(int i=0; i<arr.length; i++) {
			avg = (float)sum / arr.length;
		}
		
	}
	
	void print(int i) {
		System.out.println("arr"+i+"�� max = " + max);

		System.out.println("arr"+i+"�� sum = " + sum);

		System.out.println("arr"+i+"�� avg = " + avg);
		
	}
	
	
	
}

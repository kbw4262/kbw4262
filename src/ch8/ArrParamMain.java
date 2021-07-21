package ch8;

public class ArrParamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrParam ap = new ArrParam();
			int[] arr1 = {1,2,3,4,5};
			ap.makeMax(arr1);
			ap.makeSum(arr1);
			ap.makeAvg(arr1);
			ap.print(1);
			
			int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
			ap.makeMax(arr2);
			ap.makeSum(arr2);
			ap.makeAvg(arr2);
			ap.print(2);
			
	}

}

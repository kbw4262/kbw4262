package ch7;

public class PointArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Point[] arr = new Point[5];
		
		for(int i =0; i< 5; i++) {
			arr[i] = new Point();
			arr[i].x = i+1;
			arr[i].y = i+1;
			
		}
		
		for(int i=0; i<5; i++) {
			
			System.out.println("arr["+ i + "].x = " + arr[i].x);
			System.out.println("arr["+ i + "].y = " + arr[i].y);
			System.out.println();
		}
		Point[] arr2 = new Point[5]; // arr2 이라는 클라스 배열만 선언
		arr2[0] = new Point(); // arr2[0] 생성 - 메모리에 이때 올려줌. 객체 생성.
		arr2[0].x = 5;
		arr2[0].y = 10;
		arr2[0].print();
		
		
		
	}

}

package ch14;

public class WrapTest {
	
		public Object[] arr = new Object[10]; // object 타입의 배열을 생성
		// object는 모든 클래스의 상위 클래스 이므로 모든 클래스의 객체를
		// 업캐스팅 해서 이 배열에 저장할 수 있다.
		
		public int cnt=0;
		public void add(Object obj) {   // arr배열에 object 객체를 추가한다.
			arr[cnt++] = obj;
		}
		
		
		public void print() {
			for(int i = 0; i< cnt; i++) {
				Object o = arr[i];
				if( o instanceof Integer) { // 꺼낸 객체가 Integer형 객체인지 확인
					System.out.println(((Integer)o).intValue());
				}
				else if(o instanceof Float) { // 꺼낸 객체가 Float형 객체인지 확인
					System.out.println(((Float)o).floatValue());
					// floatValue() 메서드로 Float객체를 float형 기본타입으로 변환.
					// o 앞에 붙은 Float는 객체니깐 대문자 F
				}
				else {
					System.out.println("arr ["+i+"] = " + arr[i]);
				}
				
			}
			
			
		}
		
		

}

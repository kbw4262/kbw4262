package ThisIsJava_4;

public class SwitchNoBreakCaseExample {

	
		public static void main(String[] args) {
			int time = (int)(Math.random()*4)+8;
			System.out.println("현재시각 : "+ time + "시");
			
			
			switch(time) {
			case 8:
				System.out.println("출근 합니다.");
			case 9:
				System.out.println("회의 합니다.");
			case 10:
				System.out.println("업무 합니다.");
			default :
				System.out.println("외근나갑니다.");
			
			
			}
			
		}
}

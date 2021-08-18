package Hospital;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PatientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient[] patient = new Patient[10];
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		int patientCount=0;//  입원중인 환자 수 초기화
		
		
		do {
			System.out.println("입원 관리 프로그램");
			System.out.println("1. 환자 입원 수속 / 2. 입원 환자 조회 / 3. 입원 환자 정보 수정 / 4. 퇴원 수속 / 0. 끝내기");
			System.out.print("사용하실 기능에 해당하는 숫자를 입력하세요 : ");
			try {
				menu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력 가능합니다.");
			}
			
			switch(menu) {
			
			case 1:
				//환자 입원 수속
				//타입이 안맞으면 예외가 발생할 수 있습니다.
				/*예외처리 필수. 생성자에서 해도됨.
				 * 
				 *예를들면)
				 * try {
							menu = sc.nextInt();
						}catch(InputMismatchException e) {
							System.out.println("정수만 입력 가능합니다.");
						}
			
				 */
				//patientCount++;
				break;
				
			case 2:
				// 환자 입원 조회
				break;
				
			case 3:
				// 입원 환자 정보 수정
				break;
				
			case 4:
				// 입원 환자 퇴원 
				break;
				
			default : 
					System.out.println("잘못 입력하셧습니다.");
					System.out.println();
			}
			
			
		}while(menu != 0);
		
		System.out.println("반복문 탈출됨");
		
		// 환자를 병실에 연결
		
		
		
	}

}

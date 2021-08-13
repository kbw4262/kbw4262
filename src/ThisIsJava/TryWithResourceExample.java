package ThisIsJava;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read(); //<<- 실행되서 파일을 읽는데
			throw new Exception(); // 강제적으로 예외 발생시킴
			// 그래서 바로 파일을 닫고. 밑에 catch문 실행됨.
		}
		catch(Exception e) {
			System.out.println("예외 처리 코드가 실행 되었습니다.");
		}
				
	}

}

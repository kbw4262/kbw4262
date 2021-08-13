package ch14;

import java.io.IOException;

public class IOExcThrowsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOExcThrows io = new IOExcThrows();
		try {//IOExecThrows의 객체를 생성.
			io.input(); // input() 메서드 호출
			//try문안의 수행할 문장들에서 예외가 발생하지 않는다면 catch문 다음의 문장들은 수행이 되지 않는다.
		}catch(IOException e) {
			e.printStackTrace();
		}
		io.print();
	}

}

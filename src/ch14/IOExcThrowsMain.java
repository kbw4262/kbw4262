package ch14;

import java.io.IOException;

public class IOExcThrowsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOExcThrows io = new IOExcThrows();
		try {//IOExecThrows�� ��ü�� ����.
			io.input(); // input() �޼��� ȣ��
			//try������ ������ ����鿡�� ���ܰ� �߻����� �ʴ´ٸ� catch�� ������ ������� ������ ���� �ʴ´�.
		}catch(IOException e) {
			e.printStackTrace();
		}
		io.print();
	}

}

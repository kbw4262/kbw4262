package ch14;

import java.io.IOException;

public class IOExcThrows {
	char[] arr = new char[10];
	int i =0;
	// ����� �ڵ��̱� ������ ����ó���� �ؾ� ������, throws�� ����ó���� �̷�
	// ���� �޼��忡���� ���� ó���� ���� �ʾƵ� ��. ������ �� �޼��带 ȣ���ϴ� �ڵ忡��
	// ����ó���� �ؾ����� �������� ����.
	
	void input() throws IOException{
		while((arr[i++] = ((char) System.in.read())) != '\n')
			;
	}

		void print() {//arr�� ����� ���ڵ��� ��� ���.
			int j=0;
			while(j<i) {
				System.out.print(arr[j++]);
			}
			
		}
	
}

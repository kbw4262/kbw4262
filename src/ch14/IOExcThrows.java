package ch14;

import java.io.IOException;

public class IOExcThrows {
	char[] arr = new char[10];
	int i =0;
	// 입출력 코드이기 때문에 예외처리를 해야 하지만, throws로 예외처리를 미뤄
	// 현재 메서드에서는 예외 처리를 하지 않아도 됨. 하지만 이 메서드를 호출하는 코드에서
	// 예외처리를 해야지만 컴파일이 가능.
	
	void input() throws IOException{
		while((arr[i++] = ((char) System.in.read())) != '\n')
			;
	}

		void print() {//arr에 저장된 문자들을 모두 출력.
			int j=0;
			while(j<i) {
				System.out.print(arr[j++]);
			}
			
		}
	
}

package ch14;
import java.io.IOException;
public class IOTest {

	public static void main(String[] args) {
		
		int ch = 0;
		try {
			while((ch = System.in.read()) != '\n') { // ǥ���Է�����
				//�� ����Ʈ�� �о� ch�� �����ϴµ� �Էµ� ���� '\n' �̸� ������ �ߴ�.
				//�� ������ ����� �ڵ尡 ���� �ǹǷ� ����ó���� ���� ������ ������ ���� �����Ƿ�
				//try������ ó��. IOException�� �ƴ� �ٸ� ���ܸ� ó���Ѵٸ� ������ ���� ���� ���̴�.
				System.out.println((char)ch);
			}
		}catch(IOException e){
			e.printStackTrace(); // ������ �� �޼����� ����ϴ� �޼���
		}
		
		
	}
	
}

package ThisIsJava;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read(); //<<- ����Ǽ� ������ �дµ�
			throw new Exception(); // ���������� ���� �߻���Ŵ
			// �׷��� �ٷ� ������ �ݰ�. �ؿ� catch�� �����.
		}
		catch(Exception e) {
			System.out.println("���� ó�� �ڵ尡 ���� �Ǿ����ϴ�.");
		}
				
	}

}

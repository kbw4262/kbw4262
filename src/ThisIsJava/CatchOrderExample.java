package ThisIsJava;

public class CatchOrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];
			int v1 = Integer.parseInt(data1);
			int v2 = Integer.parseInt(data2);
			int result = v1 + v2;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű� ���� ���� �����մϴ�. ");
		}catch(Exception e) {
			System.out.println("���࿡ ������ �ֽ��ϴ�");
		}finally {
			System.out.println("�ٽ� �����ϼ���");
		}
	}

}

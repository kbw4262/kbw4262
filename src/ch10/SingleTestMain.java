package ch10;

public class SingleTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���Ѵ�. SingleTest s = new SingleTest();
		// �����ڰ� private �̱� ������ Ŭ���� �ۿ��� ��ü������ �Ұ����ϴ�.
		
		SingleTest s = SingleTest.getSingleTest();
		// get �� ȣ���ؼ� SingTest Ŭ���� ������ ������
		// ��ü�� ��ȯ �޾Ƽ� ����Ѵ�.
		
		/*��ü�� �Ѱ� ���鶧 ����ϴ� �̱��� ����̴�.
		 * Ŭ�������� ������� static SingleTest s �Ҵ����ְ�
		 * �װ��� ���ο��� getSingleTest�� ȣ�����ִ°Ŷ�
		 * ��ü�� �ϳ��� �����Ҷ��� ���̴� ���
		 * �ǹ������� �� �Ⱦ��ٰ� �Ѵ�. ��..���� ���� ��..
		 */
		
		
		s.print();
		
	}

}

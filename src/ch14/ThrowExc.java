package ch14;

public class ThrowExc {

	String str = null; // �� Ŭ������ str.
	// �޼��� subStr()�� ������� str�� �Ķ���� idx ��ġ���� �߶󳽴�.
	// �׷��� ���ڿ� ó�� �� str�� null������ Ȯ���ϰ� null�̸� ���ܸ� �߻��ϰ�
	// null �� �ƴϸ� ���ڸ� idx��ŭ �߶󳻾� �����Ѵ�.
	
	public String subStr(int idx) {
		if(str == null) {
			System.out.println("str�� null�̴�.");
			throw new NullPointerException(); 
			// str�� null�̸� NullPointerExection ��ü�� �����Ͽ� ������.
			// �� ���� ��ü�� ��Ÿ�� �ý������� ���޵ǰ�, �ý����� �ڵ鷯�� ã�� ����.
		}else {
			return str.substring(idx);
		}
	}
	
	
}

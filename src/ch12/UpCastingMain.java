package ch12;

public class UpCastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("UpCastingParent ��ü");
		UpCastingParent up  = new UpCastingParent();
		System.out.println("up.add = "+ up.add());
		System.out.println();
		
		System.out.println("UpCastingChild ��ü");
		UpCastingChild uc = new UpCastingChild();
		System.out.println("uc.add = " + uc.add());
		System.out.println("uc.sub = " + uc.sub());
		System.out.println();
		
		System.out.println("UpCasting �� ��ü");
		UpCastingParent upc;  // "Parent"
		//��ĳ���� ��ü�� ����, Ÿ���� �θ�Ŭ���� UpCastingParent�̰�
		upc = new UpCastingChild();  // Child
		// ������ ȣ���� �ڽ�Ŭ������ UpCastingChild���� ȣ��
		System.out.println("upc.add = "+ upc.add());
		//System.out.println("upc.sub = "+_upc.sub());
		/*
		 * sub()ȣ���ϴµ�, upc Ÿ���� UpCastingParent��
		 * �� Ŭ�������� sub()�� ���� �Ǿ����� �ʴ�. �׷��� ���� �߻�
		 * ��ó�� Ÿ���� �θ�, ����Ǵ� ���´� �ڽ��ΰ��� ��ĳ�����̶�� ��.
		 * 
		 *  -> �ٵ� �޼��� ȣ���ϴ� ������ �θ��ε� ����..?
		 */
	}

}

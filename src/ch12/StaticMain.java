package ch12;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticParent sp = new StaticParent();
		sp.name = "static parent";
		sp.printInfo();
		System.out.println(" - -- --- -- - ");
		
		StaticChild sc = new StaticChild();
		sc.name = "static Child";
		sc.setAge(10);
		sc.printInfo();
		System.out.println(" -----------------");
		
		StaticParent spc = new StaticChild(); //��ĳ�������� ��ü����
		spc.name = "upCasting"; // static�� �ȹٲ�.. �״�� �θ� ��. �׷��� �θ𲬷� ����..
		spc.printInfo();
		//StaticChild c = (StaticChild)spc;
		//c.setAge(20);
		//c.printInfo();
	}

}

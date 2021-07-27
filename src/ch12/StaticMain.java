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
		
		StaticParent spc = new StaticChild(); //¾÷Ä³½ºÆÃÀ¸·Î °´Ã¼»ý¼º
		spc.name = "upCasting"; // staticÀº ¾È¹Ù²ñ.. ±×´ë·Î ºÎ¸ð²¨ ¾¸. ±×·¡¼­ ºÎ¸ð²¬·Î ³ª¿È..
		spc.printInfo();
		//StaticChild c = (StaticChild)spc;
		//c.setAge(20);
		//c.printInfo();
	}

}

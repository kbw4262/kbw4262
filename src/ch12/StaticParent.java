package ch12;

public class StaticParent {

	protected static String name;
	
	static {
		name = "parent";
	}
	
	public static void printInfo() {
		System.out.println("parent");
		System.out.println("name : "+ name);
	}
	
	
}

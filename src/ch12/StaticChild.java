package ch12;

public class StaticChild extends StaticParent {

	private static int age;
	
	public static void printInfo() {
		System.out.println("Child");
		System.out.println("name : "+ name);
		System.out.println("age : " + age);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static int getAge() {
		return age;
	}
	
}

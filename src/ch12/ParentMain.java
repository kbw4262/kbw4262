package ch12;

public class ParentMain {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.name = "parent";
		p.printInfo();
		System.out.println(" ----------------- ");
		Child c = new Child();
		c.name = "child";
		c.setHobby("swimming");
		c.printInfo();
		
	}

}

package ch14;

class Test{
	public int x;
	public int y;
}
public class HashTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1 = new Test();
		Test t2 = t1;
		Test t3 = new Test();

		System.out.println("t1.hashCode() = "+ t1.hashCode());
		System.out.println("t2.hashCode() = "+ t2.hashCode());
		System.out.println("t3.hashCode() = "+ t3.hashCode());
		
		System.out.println(t1);
		System.out.println(t1.toString());
		
	}

}

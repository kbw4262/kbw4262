package ThisIsJava;

public class GarbageCollectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp emp = new Emp(1);
		emp = null;
		emp = new Emp(2);
		emp = new Emp(3);
		
		System.out.println("emp�� ���������� �����ϴ� �����ȣ:" + emp.eno);
		System.gc();
		
		
	}

}



class Emp{
	public int eno;
	public Emp(int eno) {
		this.eno = eno;
		System.out.println("Employee ( " + eno + ") �� �޸𸮿� ������");
	}

	public void finalize() {
		System.out.println("Employee("+eno+") �� �޸𸮿��� ���ŵ�");
	}
	
}
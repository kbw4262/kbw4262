package ch9;

public class Test {

	int add_int(int x, int y) {
		return x+y;
	}
	
	float add_float(float x, float y) {
		return x+y;
	}
	
	String add_String(String x, String y) {
		return x+y;
	}
	
	int add_int(int x, int y, int z) {
		return x+y+z;
	} // �޼��� �����ε� ** Ŭ����, ����, �޼��� ���� �̸��� ����� ��Ģ : �̹� ���� �̸��� �� �����ϸ� �ȵȴ�.
	  // �̸��� ���������� �Ķ������ ������ Ÿ���� �ٸ��� �Ͽ� ������ ȣ���ߴ��� ����
	
	void add_int() {
		System.out.println(" ���ϱ�! ");
	}
	
	
	
}

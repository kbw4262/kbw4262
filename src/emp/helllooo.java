package emp;

public class helllooo {

	int a = 0;
	private Abstract_1 ab;
	
	public helllooo(Abstract_1 ab) {
		this.ab = ab;
	}
	void print() {
		ab.print();
	}
	int add() {
		return ab.add();
	}
	
	
	
}

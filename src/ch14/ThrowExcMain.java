package ch14;

public class ThrowExcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowExc te = new ThrowExc(); // ThrowExc ��ü (te)�� ����.
		String str = te.subStr(2); // subStr()ȣ��. 
		System.out.println(str); // ������ str�� null�̱� ������ ���ܰ� �߻�.
	}

}

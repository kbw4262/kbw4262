package ch13.db;

public class MsImpl implements DbInterface{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL ������ ���̽� �ý��ۿ� �����մϴ�.");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL ������ ���̽� �ý��ۿ��� �����͸� �˻��մϴ�");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL ������ ���̽� �ý��ۿ��� �����͸� �����մϴ�.");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL ������ ���̽� �ý��ۿ��� �����͸� �����մϴ�.");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL ������ ���̽� �ý��ۿ� �����͸� �߰��մϴ�.");
	}

}

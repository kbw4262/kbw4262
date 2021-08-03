package ch13.db;

public class MsImpl implements DbInterface{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL 데이터 베이스 시스템에 연결합니다.");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL 데이터 베이스 시스템에서 데이터를 검색합니다");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL 데이터 베이스 시스템에서 데이터를 수정합니다.");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL 데이터 베이스 시스템에서 데이터를 삭제합니다.");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Ms-SQL 데이터 베이스 시스템에 데이터를 추가합니다.");
	}

}

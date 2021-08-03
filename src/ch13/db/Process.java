package ch13.db;

public class Process {

	private DbInterface db;
	
	public Process(DbInterface db) {
		this.db = db;
	}
	void  connect() {
		db.connect();
	}
	void select() {
		db.select();
	}
	void insert() {
		db.insert();
	}
	void update() {
		db.update();
	}
	void delete() {
		db.delete();
	}
	
	
	
	
}

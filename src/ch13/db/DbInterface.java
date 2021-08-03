package ch13.db;

public interface DbInterface {

		void connect();
		void select();
		void insert();
		void update();
		void delete();
	
}

interface B extends DbInterface{
	
}

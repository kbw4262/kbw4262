package Hospital_2;

public interface PrintInfo {

	abstract void printTotalRoom();
	void printRoomMaxPerson(int roomNumber);
	void printPossibleRoom();
	boolean roomCheck(int number);
	boolean updateRoomCheck(int newNum, int nowNum);

}

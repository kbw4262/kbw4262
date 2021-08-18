package Hospital;

public class Room implements PrintInfo{

	
	protected static int[][] room ={
		{101,10,0},  	//101ȣ - Max �ο��� 10��  - �����ο��� 0 
		{102,8,0},		//102ȣ - Max �ο��� 8��   - �����ο��� 0
		{103,12,0},		//103ȣ - Max �ο��� 12��  - �����ο��� 0
		{104,5,0},		//104ȣ - Max �ο��� 5��   - �����ο��� 0
		{105,15,0}		//105ȣ - Max �ο��� 15��  - �����ο��� 0
	}; // �� �Կ� ���� ȯ�� �� 50��
	
	
	protected static final int MAX_COUNT = 50; // �� �Կ� ������ ȯ�ڼ�.
	boolean CheckPossible; // ���� �ش�Ǵ� ���ǿ� �Կ��� �������� üũ
	

	@Override
	public void printTotalRoom() { // ��� Room�� ���� ����
		for(int i=0; i<room.length; i++) {
			System.out.println(room[i][0]+ "ȣ�� �ִ� �Կ� ȯ�� ���� = "+ room[i][1]+ "�� ���� �ο����� " + room[i][2]+"�� �Դϴ�.");
		}
	}
	public void printRoomMaxPerson(int roomNumber) { // ���õ� ������ ���� ����
		// TODO Auto-generated method stub
		System.out.println(room[roomNumber][0]+ "ȣ�� �ִ� �Կ� ȯ�� ���� = "+ room[roomNumber][1] + "�� ���� �ο����� " + room[roomNumber][2]+"�� �Դϴ�." );
	}
	
	
	
}

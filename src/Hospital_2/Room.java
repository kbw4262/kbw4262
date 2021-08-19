package Hospital_2;

public class Room implements PrintInfo{

	
	protected static int[][] room ={
		{101,10,0},  	//101ȣ - Max �ο��� 10��  - �����ο��� 0 
		{102,8,0},		//102ȣ - Max �ο��� 8��   - �����ο��� 0
		{103,12,0},		//103ȣ - Max �ο��� 12��  - �����ο��� 0
		{104,5,0},		//104ȣ - Max �ο��� 5��   - �����ο��� 0
		{105,15,0}		//105ȣ - Max �ο��� 15��  - �����ο��� 0
	}; // �� �Կ� ���� ȯ�� �� 50��
	
	
	protected static final int MAX_COUNT = 50; // �� �Կ� ������ ȯ�ڼ�.
	boolean[] CheckPossible = new boolean[5]; // ���� �ش�Ǵ� ���ǿ� �Կ��� �������� üũ
	

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
	
	public void printPossibleRoom()  //�Կ� ������ ���� ���
	{
		for(int i=0;i<room.length;i++)
		{
			if(room[i][1] > room[i][2] )
			{
				System.out.println(room[i][0] + "ȣ �Կ� �����մϴ� (���� �Կ� ���� �� : " + (room[i][1]-room[i][2])+")");
				
			}
		}
	}
	

	public boolean roomCheck(int number)  //�ű��Կ� ��û�� ���� �Կ� �����Ѱ����� üũ �� ���ο��� ����
	{

		for(int i =0;i< room.length;i++)
		{
			if(number == room[i][0]) // ���ȣ�� ã�´�
			{
				if(room[i][1]>room[i][2]) // ���� �ο��� Max �ο��� ���Ѵ�.
				{
					room[i][2]++; // �����ο��� �� ������ ++
					return true;
				}
				else
				{
					System.out.println("�� ���� �Կ� �Ұ��Դϴ�");
					return false;
				}
			}
		
		}
		System.out.println("��Ȯ�� ȣ���� �Է��ϼ���");
		return false;
		
	}
	
	public boolean updateRoomCheck(int newNum, int nowNum)  //�� �ű�� üũ �� �ο��� ����
	{
		
		if(newNum == nowNum)
		{
			return true;
		}
		else if(newNum != nowNum)
		{
			for(int i =0;i< room.length;i++)
			{
				if(newNum == room[i][0])
				{
					if(room[i][1]>room[i][2])
					{
						room[i][2]++;
						
						for(int j=0;j<room.length;j++)
						{
							if(newNum == room[j][0])
							{
								room[j][2]--;
							}
						}
						
						return true;
					}
					
					else
					{
						System.out.println("�� ���� �Կ� �Ұ��Դϴ�");
						return false;
					}
				}

	
			}
		}
		
		System.out.println("��Ȯ�� ȣ���� �Է��ϼ���");
		return false;
		
	}
	
	
	
}

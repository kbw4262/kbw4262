package Hospital_2;

public class Room implements PrintInfo{

	
	protected static int[][] room ={
		{101,10,0},  	//101호 - Max 인원수 10명  - 현재인원수 0 
		{102,8,0},		//102호 - Max 인원수 8명   - 현재인원수 0
		{103,12,0},		//103호 - Max 인원수 12명  - 현재인원수 0
		{104,5,0},		//104호 - Max 인원수 5명   - 현재인원수 0
		{105,15,0}		//105호 - Max 인원수 15명  - 현재인원수 0
	}; // 총 입원 가능 환자 수 50명
	
	
	protected static final int MAX_COUNT = 50; // 총 입원 가능한 환자수.
	boolean[] CheckPossible = new boolean[5]; // 현재 해당되는 병실에 입원이 가능한지 체크
	

	@Override
	public void printTotalRoom() { // 모든 Room의 정보 보기
		for(int i=0; i<room.length; i++) {
			System.out.println(room[i][0]+ "호의 최대 입원 환자 수는 = "+ room[i][1]+ "명 현재 인원수는 " + room[i][2]+"명 입니다.");
		}
	}
	public void printRoomMaxPerson(int roomNumber) { // 선택된 병실의 정보 보기
		// TODO Auto-generated method stub
		System.out.println(room[roomNumber][0]+ "호의 최대 입원 환자 수는 = "+ room[roomNumber][1] + "명 현재 인원수는 " + room[roomNumber][2]+"명 입니다." );
	}
	
	public void printPossibleRoom()  //입원 가능한 병실 목록
	{
		for(int i=0;i<room.length;i++)
		{
			if(room[i][1] > room[i][2] )
			{
				System.out.println(room[i][0] + "호 입원 가능합니다 (남은 입원 가능 수 : " + (room[i][1]-room[i][2])+")");
				
			}
		}
	}
	

	public boolean roomCheck(int number)  //신규입원 신청한 방이 입원 가능한곳인지 체크 및 방인원수 증가
	{

		for(int i =0;i< room.length;i++)
		{
			if(number == room[i][0]) // 방번호를 찾는다
			{
				if(room[i][1]>room[i][2]) // 현재 인원과 Max 인원을 비교한다.
				{
					room[i][2]++; // 현재인원이 더 작으면 ++
					return true;
				}
				else
				{
					System.out.println("이 방은 입원 불가입니다");
					return false;
				}
			}
		
		}
		System.out.println("정확한 호수를 입력하세요");
		return false;
		
	}
	
	public boolean updateRoomCheck(int newNum, int nowNum)  //방 옮길시 체크 및 인원수 조정
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
						System.out.println("이 방은 입원 불가입니다");
						return false;
					}
				}

	
			}
		}
		
		System.out.println("정확한 호수를 입력하세요");
		return false;
		
	}
	
	
	
}

package Hospital;

public class Room implements PrintInfo{

	
	protected static int[][] room ={
		{101,10,0},  	//101호 - Max 인원수 10명  - 현재인원수 0 
		{102,8,0},		//102호 - Max 인원수 8명   - 현재인원수 0
		{103,12,0},		//103호 - Max 인원수 12명  - 현재인원수 0
		{104,5,0},		//104호 - Max 인원수 5명   - 현재인원수 0
		{105,15,0}		//105호 - Max 인원수 15명  - 현재인원수 0
	}; // 총 입원 가능 환자 수 50명
	
	
	protected static final int MAX_COUNT = 50; // 총 입원 가능한 환자수.
	boolean CheckPossible; // 현재 해당되는 병실에 입원이 가능한지 체크
	

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
	
	
	
}

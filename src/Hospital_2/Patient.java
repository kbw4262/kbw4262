package Hospital_2;

public class Patient extends Room  {

	String pname;	//환자이름
	int age;		//나이
	String date;	//입원날짜 (Date 타입으로 바꿀까 생각중입니다. 아니면 아에 없애거나
	int roomNumber;	//입원실 번호
	int key;
	Patient(String pname, int age, String date, int roomNumber, int key){
		this.pname = pname;
		this.age = age;
		this.date = date;
		for(int i=0; i<room.length; i++) {
			if(roomNumber == room[i][0]) {
				this.roomNumber = roomNumber;
			}
		}
		this.key =key;
	}
	// 환자 수정 등등에 활용할 get,set 메서드
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPname() {
		return this.pname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return this.date;
	}
	
	public void setRoomNumber(int roomNumber)
	{
		this.roomNumber = roomNumber;
	}
	
	public int getRoomNumber()
	{
		return this.roomNumber;
	}
	
	public void setKey(int key)
	{
		this.key = key;
	}
	
	public int getKey()
	{
		return this.key;
	}
	
/*
	boolean CheckPossibleHospitalization(int roomNumber, int patientCnt) { 
		// 환자 입원 했을 때 생성자를 통해서 T/F 체크 
		// 해당 입원실에 환자가 입원 가능하면 T
		// 해당 입원실에 환자가 입원 불가능하면 F
		
		CheckPossible = false; // 해당 병실에 입원 가능한지 체크
		
		if(patientCnt >= MAX_COUNT) { // 병원에 있는 모든 입원실에 환자가 가득 찼습니까?
			System.out.println("원내에 있는 모든 입원실이 가득 찼습니다!");
			return CheckPossible;  // false 그대로 리턴 됨.
		}else {
		for(int i=0; i<room.length; i++) {
			if(roomNumber==room[i][0]) { //입원실 찾기
				if(patientCnt < room[i][2]) {
					CheckPossible = true;
					return CheckPossible;
				}
				else {
					System.out.println("해당 입원실이 가득 찼습니다.");

					
				}
			}
		}
		return CheckPossible;
		}
	}*/
	
	
	/*
	 * PatientMain까지 작성해주시면 됩니다. 
	 * Room 수정해서 해도 상관은 없지만 수정하면 말씀해주세요. 일부러 정적배열로 만들었습니다.
	 * 
	 */
	
	//   환자 입원 수속 -- 김준하
	/* - 입원 할 때 입원실 풀차있는거 CheckPossibleHospitalization로 체크할 수 있음. <- 수정하셔도되요~
	 * - Patient 객체를 객체 배열로 선언할건데 다른 좋은 의견있으시면 말해주세요.
	 * - patient 정적 배열로 선언했기 때문에 ArrayIndexOutOfBoundsException이 발생할 수 있습니다. 
	 *   
	 * - Room 클래스에 입원실 현재인원수 증가하게끔 부탁드립니다..
	 * 
	 */
	
	//   입원 환자 정보 수정 - 송주영
	/* -  patient 객체 배열로 선언해서 중구난방으로 배열에 몇호 쓰는지 저장되어있을겁니다. 
	 * -  이름으로 검색 먼저 기능 구현하고 시간 남으신다면 Date date해서 날짜별 검색까지 부탁드려요
	 * -  환자 정보 수정시 입원실 바뀌면 입원실 현재 입원 환자수 카운트도 바꾸셔야합니다.
	 * 
	 * 
	 * 
	 */
	
	//   입원 환자 삭제 - 김혜선
	/* - 퇴원 환자를 고려해서 환자수카운트가 -가 되면 안됩니다. 
	 * - patient 객체 배열 삭제도 중요하지만 room에 있는 배열 현재인원수도 수정하셔야합니다. 
	 * - 삭제작업 완료 후 총 입원 환자 수 -- 하셔야합니다. patientCount. 메인에 있어요.
	 * 
	 */
	
	
	//   환자 입원 조회 -- 이두섭
	/*
	 *   1. 환자이름으로 환자 입원조회
	 *   2. 환자입원날짜로 환자 입원조회 (해당 기간에 입원한 모든 환자 조회하는 겁니다)
	 *   3. 환자 나이로 환자입원조회( 같은 나이면 모두 검색 가능하게)
	 *   
	 */
	
	
	
	
	
	
	
	
	

}

package Hospital_2;

import java.util.Scanner;



public class ProgramMethod extends PatientMain  {

	String name="";
	int age;		//나이
	String date;	//입원날짜 (Date 타입으로 바꿀까 생각중입니다. 아니면 아에 없애거나
	int roomNumber;
	Scanner sc= new Scanner(System.in);
	Room roomSelect = new Room();
	int key =0;
	

	
	
	
	public void add()
	{
		int select = 0;
		System.out.println("1. 수속진행 2. 입원가능 방 조회 3. 전체 방 조회 4. 수속취소");
		select = sc.nextInt();
		
		if(patient.size() < roomSelect.MAX_COUNT)  // 
		{
			switch(select)
			{
			case 1:  // 수속진행
				System.out.println("수속 진행합니다 다음을 입력해주세요");
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("나이 : ");
				age = sc.nextInt();
				System.out.print("날짜 : ");
				date = sc.next();
				System.out.print("방 번호 : ");
				roomNumber = sc.nextInt();

				if(roomSelect.roomCheck(roomNumber) == true) // 방번호를 입력받아서 현재인원과 MAX인원을 비교. 여유가 남으면 true 리턴
				{
					patient.add(new Patient(name, age, date,roomNumber, key));
					System.out.println(name+"님 "+ roomNumber+"호로 입원 완료되었습니다");
					key++;
				}
		
				break;
			case 2:
				roomSelect.printPossibleRoom();
				break;
			case 3:
				roomSelect.printTotalRoom();
				break;
			case 4:
				break;	
			}
		}
		else
		{
			System.out.println("현재 모든 방 입원 불가합니다");
		}
	}
	
	
	public void select()
	{
		int select = 0;
		String selectName ="";
		int selectAge=0;
		String selectDate="";
		int selectRoomNumber=0;
		int allFinish =0;
		int allCnt=0;
		
		int count=0;
		System.out.println("1. 전체 환자 조회 2. 이름으로 조회  3. 나이로 조회 4. 날짜로 조회 5.방으로 조회");
		select = sc.nextInt();
		
		switch(select)
		{
		case 1:
			if(patient.size()>0) // 환자가 있을 경우.
			{
				for(int i = 0;i<roomSelect.room.length;i++)
				{
					allFinish =0; // 방 카운터
					allCnt=0; // 방 인원수 카운터
					for(Patient j : patient)
					{
						if(j.getRoomNumber() == roomSelect.room[i][0] && allCnt == 0) // 환자의 방번호가 입원실 번호랑 같고 모든 카운터가 0일 때 
						{
							System.out.print(j.getRoomNumber() + "호 : "+j.getPname()); // 몇호에 누구삽니다.
							allCnt++;
							

						}
						else if(j.getRoomNumber() == roomSelect.room[i][0] && allCnt != 0)
						{
						
							System.out.print(", "+j.getPname()); // 위에 이어서 쭈르륵 나열하려고 
							//ex) 위에만 if만 한다면 [101호 : 구본우] 지금 이 라인이랑 합치면 [101호: 구본우, 팔본우, 칠본우]
							
						}
						
						allFinish++; // 다음방으로 넘어가기.
						if(patient.size()==allFinish && allCnt !=0)
						{
							System.out.println();
						}
					
					}
				}
				
			}
			else
			{
				System.out.println("현재 입원중인 환자는 없습니다");
			}

			break;
		case 2:
			System.out.println("조회할 이름을 입력하세요");
			selectName = sc.next();
			for(Patient i : patient)
			{
				if(i.getPname().equals(selectName))
				{
					System.out.println(i.getPname()+"님 " + i.getRoomNumber()+"호에서 입원중이십니다 (나이 : " + i.getAge() + " 입원 날짜 : " + i.getDate()+"key값 : " + i.getKey()+")" );
					count++;
				}

			}
			if(count == 0 )
			{
				System.out.println("조회하신 이름의 환자분은 없습니다");
			}
			break;
		case 3:
			System.out.println("조회할 나이를 입력하세요");
			selectAge = sc.nextInt();
			for(Patient i : patient)
			{
				if(i.getAge()==selectAge)
				{
					System.out.println(i.getPname()+"님 " + i.getRoomNumber()+"호에서 입원중이십니다 (나이 : " + i.getAge() + "입원 날짜 : " + i.getDate()+"key값 : " + i.getKey()+")");
					count++;
				}

			}
			if(count == 0 )
			{
				System.out.println("조회하신 나이의 환자분은 없습니다");
			}
			break;
			
		case 4:
			System.out.println("조회할 날짜를 입력하세요");
			selectDate = sc.next();
			for(Patient i : patient)
			{
				if(i.getDate().equals(selectDate))
				{
					System.out.println(i.getPname()+"님 " + i.getRoomNumber()+"호에서 입원중이십니다 (나이 : " + i.getAge() + "입원 날짜 : " + i.getDate()+"key값 : " + i.getKey()+")");
					count++;
				}
	
			}
			if(count == 0 )
			{
				System.out.println("조회하신 날짜에 입원하신 환자분은 없습니다");
			}
			break;
			
		case 5:
			System.out.println("조회할 방 번호를 입력하세요");
			selectRoomNumber = sc.nextInt();
			for(Patient i : patient)
			{
				if(i.getRoomNumber()==selectRoomNumber)
				{
					System.out.println(i.getPname()+"님 " + i.getRoomNumber()+"호에서 입원중이십니다 (나이 : " + i.getAge() + "입원 날짜 : " + i.getDate()+"key값 : " + i.getKey()+")");
					count++;
				}

			}
			if(count == 0 )
			{
				System.out.println("조회하신 방에는 환자분이 없습니다");
			}
			break;
			
		}
	}
	
	void update() //각각의 환자를 구분할 수 있는 키값으로 수정(완전한 키값은 미완성)
	{
		int updateKey;
		int count = 0;
		int num =0;
		int index =0;
		System.out.println("정보 수정을 원하시는 환자분의 key값을 입력하세요");
		updateKey = sc.nextInt();
		
		for(Patient i : patient)
		{
		
			if(i.getKey()==updateKey)
			{
				index = count;
				count++;
			}

		}
		
		if(count == 0 )
		{
			System.out.println("조회하신 키값에 해당하는 환자분은 없습니다");
		}
		else if(count !=0)
		{
			updateKey=0;
			System.out.println(patient.get(index).getPname() +"님의 정보를 수정 하시겠습니까? 1. 예 2. 아니오");
			updateKey=sc.nextInt();
			
			switch(updateKey)
			{
			case 1:
				System.out.println(patient.get(index).getPname()+"님의 현재정보");
				System.out.println("나이 : " + patient.get(index).getPname());
				System.out.println("나이 : " + patient.get(index).getAge());
				System.out.println("입원 날짜 : " + patient.get(index).getDate());
				System.out.println("입원실 호수 : "+patient.get(index).getRoomNumber());
				System.out.println("키 값 : "+patient.get(index).getKey());
				System.out.println("---------------------------------------");
				System.out.println("변경하실 정보를 입력해주세요");
				
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("나이 : ");
				age = sc.nextInt();
				System.out.print("날짜 : ");
				date = sc.next();
				System.out.print("방 번호 : ");
				roomNumber = sc.nextInt();
				
				if(roomSelect.updateRoomCheck(roomNumber,patient.get(index).getRoomNumber()) == true)
				{
					patient.get(index).setPname(name);
					patient.get(index).setAge(age);
					patient.get(index).setDate(date);
					patient.get(index).setRoomNumber(roomNumber);
				}
				
				break;
			case 2:
				break;
			}
			
			
		}
		
		
	}
	
	

}

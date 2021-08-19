package Hospital_2;

import java.util.Scanner;



public class ProgramMethod extends PatientMain  {

	String name="";
	int age;		//����
	String date;	//�Կ���¥ (Date Ÿ������ �ٲܱ� �������Դϴ�. �ƴϸ� �ƿ� ���ְų�
	int roomNumber;
	Scanner sc= new Scanner(System.in);
	Room roomSelect = new Room();
	int key =0;
	

	
	
	
	public void add()
	{
		int select = 0;
		System.out.println("1. �������� 2. �Կ����� �� ��ȸ 3. ��ü �� ��ȸ 4. �������");
		select = sc.nextInt();
		
		if(patient.size() < roomSelect.MAX_COUNT)  // 
		{
			switch(select)
			{
			case 1:  // ��������
				System.out.println("���� �����մϴ� ������ �Է����ּ���");
				System.out.print("�̸� : ");
				name = sc.next();
				System.out.print("���� : ");
				age = sc.nextInt();
				System.out.print("��¥ : ");
				date = sc.next();
				System.out.print("�� ��ȣ : ");
				roomNumber = sc.nextInt();

				if(roomSelect.roomCheck(roomNumber) == true) // ���ȣ�� �Է¹޾Ƽ� �����ο��� MAX�ο��� ��. ������ ������ true ����
				{
					patient.add(new Patient(name, age, date,roomNumber, key));
					System.out.println(name+"�� "+ roomNumber+"ȣ�� �Կ� �Ϸ�Ǿ����ϴ�");
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
			System.out.println("���� ��� �� �Կ� �Ұ��մϴ�");
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
		System.out.println("1. ��ü ȯ�� ��ȸ 2. �̸����� ��ȸ  3. ���̷� ��ȸ 4. ��¥�� ��ȸ 5.������ ��ȸ");
		select = sc.nextInt();
		
		switch(select)
		{
		case 1:
			if(patient.size()>0) // ȯ�ڰ� ���� ���.
			{
				for(int i = 0;i<roomSelect.room.length;i++)
				{
					allFinish =0; // �� ī����
					allCnt=0; // �� �ο��� ī����
					for(Patient j : patient)
					{
						if(j.getRoomNumber() == roomSelect.room[i][0] && allCnt == 0) // ȯ���� ���ȣ�� �Կ��� ��ȣ�� ���� ��� ī���Ͱ� 0�� �� 
						{
							System.out.print(j.getRoomNumber() + "ȣ : "+j.getPname()); // ��ȣ�� ������ϴ�.
							allCnt++;
							

						}
						else if(j.getRoomNumber() == roomSelect.room[i][0] && allCnt != 0)
						{
						
							System.out.print(", "+j.getPname()); // ���� �̾ �޸��� �����Ϸ��� 
							//ex) ������ if�� �Ѵٸ� [101ȣ : ������] ���� �� �����̶� ��ġ�� [101ȣ: ������, �Ⱥ���, ĥ����]
							
						}
						
						allFinish++; // ���������� �Ѿ��.
						if(patient.size()==allFinish && allCnt !=0)
						{
							System.out.println();
						}
					
					}
				}
				
			}
			else
			{
				System.out.println("���� �Կ����� ȯ�ڴ� �����ϴ�");
			}

			break;
		case 2:
			System.out.println("��ȸ�� �̸��� �Է��ϼ���");
			selectName = sc.next();
			for(Patient i : patient)
			{
				if(i.getPname().equals(selectName))
				{
					System.out.println(i.getPname()+"�� " + i.getRoomNumber()+"ȣ���� �Կ����̽ʴϴ� (���� : " + i.getAge() + " �Կ� ��¥ : " + i.getDate()+"key�� : " + i.getKey()+")" );
					count++;
				}

			}
			if(count == 0 )
			{
				System.out.println("��ȸ�Ͻ� �̸��� ȯ�ں��� �����ϴ�");
			}
			break;
		case 3:
			System.out.println("��ȸ�� ���̸� �Է��ϼ���");
			selectAge = sc.nextInt();
			for(Patient i : patient)
			{
				if(i.getAge()==selectAge)
				{
					System.out.println(i.getPname()+"�� " + i.getRoomNumber()+"ȣ���� �Կ����̽ʴϴ� (���� : " + i.getAge() + "�Կ� ��¥ : " + i.getDate()+"key�� : " + i.getKey()+")");
					count++;
				}

			}
			if(count == 0 )
			{
				System.out.println("��ȸ�Ͻ� ������ ȯ�ں��� �����ϴ�");
			}
			break;
			
		case 4:
			System.out.println("��ȸ�� ��¥�� �Է��ϼ���");
			selectDate = sc.next();
			for(Patient i : patient)
			{
				if(i.getDate().equals(selectDate))
				{
					System.out.println(i.getPname()+"�� " + i.getRoomNumber()+"ȣ���� �Կ����̽ʴϴ� (���� : " + i.getAge() + "�Կ� ��¥ : " + i.getDate()+"key�� : " + i.getKey()+")");
					count++;
				}
	
			}
			if(count == 0 )
			{
				System.out.println("��ȸ�Ͻ� ��¥�� �Կ��Ͻ� ȯ�ں��� �����ϴ�");
			}
			break;
			
		case 5:
			System.out.println("��ȸ�� �� ��ȣ�� �Է��ϼ���");
			selectRoomNumber = sc.nextInt();
			for(Patient i : patient)
			{
				if(i.getRoomNumber()==selectRoomNumber)
				{
					System.out.println(i.getPname()+"�� " + i.getRoomNumber()+"ȣ���� �Կ����̽ʴϴ� (���� : " + i.getAge() + "�Կ� ��¥ : " + i.getDate()+"key�� : " + i.getKey()+")");
					count++;
				}

			}
			if(count == 0 )
			{
				System.out.println("��ȸ�Ͻ� �濡�� ȯ�ں��� �����ϴ�");
			}
			break;
			
		}
	}
	
	void update() //������ ȯ�ڸ� ������ �� �ִ� Ű������ ����(������ Ű���� �̿ϼ�)
	{
		int updateKey;
		int count = 0;
		int num =0;
		int index =0;
		System.out.println("���� ������ ���Ͻô� ȯ�ں��� key���� �Է��ϼ���");
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
			System.out.println("��ȸ�Ͻ� Ű���� �ش��ϴ� ȯ�ں��� �����ϴ�");
		}
		else if(count !=0)
		{
			updateKey=0;
			System.out.println(patient.get(index).getPname() +"���� ������ ���� �Ͻðڽ��ϱ�? 1. �� 2. �ƴϿ�");
			updateKey=sc.nextInt();
			
			switch(updateKey)
			{
			case 1:
				System.out.println(patient.get(index).getPname()+"���� ��������");
				System.out.println("���� : " + patient.get(index).getPname());
				System.out.println("���� : " + patient.get(index).getAge());
				System.out.println("�Կ� ��¥ : " + patient.get(index).getDate());
				System.out.println("�Կ��� ȣ�� : "+patient.get(index).getRoomNumber());
				System.out.println("Ű �� : "+patient.get(index).getKey());
				System.out.println("---------------------------------------");
				System.out.println("�����Ͻ� ������ �Է����ּ���");
				
				System.out.print("�̸� : ");
				name = sc.next();
				System.out.print("���� : ");
				age = sc.nextInt();
				System.out.print("��¥ : ");
				date = sc.next();
				System.out.print("�� ��ȣ : ");
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

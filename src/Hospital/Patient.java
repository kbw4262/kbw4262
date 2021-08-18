package Hospital;

public class Patient extends Room  {

	String pname;	//ȯ���̸�
	int age;		//����
	String date;	//�Կ���¥ (Date Ÿ������ �ٲܱ� �������Դϴ�. �ƴϸ� �ƿ� ���ְų�
	int roomNumber;	//�Կ��� ��ȣ
	Patient(String pname, int age, String date, int roomNumber){
		this.pname = pname;
		this.age = age;
		this.date = date;
		for(int i=0; i<room.length; i++) {
			if(roomNumber == room[i][0]) {
				this.roomNumber = roomNumber;
			}
		}
	}
	// ȯ�� ���� �� Ȱ���� get,set �޼���
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
	

	boolean CheckPossibleHospitalization(int roomNumber, int patientCnt) { 
		// ȯ�� �Կ� ���� �� �����ڸ� ���ؼ� T/F üũ 
		// �ش� �Կ��ǿ� ȯ�ڰ� �Կ� �����ϸ� T
		// �ش� �Կ��ǿ� ȯ�ڰ� �Կ� �Ұ����ϸ� F
		
		CheckPossible = false; // �ش� ���ǿ� �Կ� �������� üũ
		
		if(patientCnt >= MAX_COUNT) { // ������ �ִ� ��� �Կ��ǿ� ȯ�ڰ� ���� á���ϱ�?
			System.out.println("������ �ִ� ��� �Կ����� ���� á���ϴ�!");
			return CheckPossible;  // false �״�� ���� ��.
		}else {
		for(int i=0; i<room.length; i++) {
			if(roomNumber==room[i][0]) { //�Կ��� ã��
				if(patientCnt < room[i][2]) {
					CheckPossible = true;
					return CheckPossible;
				}
				else {
					System.out.println("�ش� �Կ����� ���� á���ϴ�.");

					
				}
			}
		}
		return CheckPossible;
		}
	}
	
	
	/*
	 * PatientMain���� �ۼ����ֽø� �˴ϴ�. 
	 * Room �����ؼ� �ص� ����� ������ �����ϸ� �������ּ���. �Ϻη� �����迭�� ��������ϴ�.
	 * 
	 */
	
	//   ȯ�� �Կ� ���� -- ������
	/* - �Կ� �� �� �Կ��� Ǯ���ִ°� CheckPossibleHospitalization�� üũ�� �� ����. <- �����ϼŵ��ǿ�~
	 * - Patient ��ü�� ��ü �迭�� �����Ұǵ� �ٸ� ���� �ǰ������ø� �����ּ���.
	 * - patient ���� �迭�� �����߱� ������ ArrayIndexOutOfBoundsException�� �߻��� �� �ֽ��ϴ�. 
	 *   
	 * - Room Ŭ������ �Կ��� �����ο��� �����ϰԲ� ��Ź�帳�ϴ�..
	 * 
	 */
	
	//   �Կ� ȯ�� ���� ���� - ���ֿ�
	/* -  patient ��ü �迭�� �����ؼ� �߱��������� �迭�� ��ȣ ������ ����Ǿ������̴ϴ�. 
	 * -  �̸����� �˻� ���� ��� �����ϰ� �ð� �����Ŵٸ� Date date�ؼ� ��¥�� �˻����� ��Ź�����
	 * -  ȯ�� ���� ������ �Կ��� �ٲ�� �Կ��� ���� �Կ� ȯ�ڼ� ī��Ʈ�� �ٲټž��մϴ�.
	 * 
	 * 
	 * 
	 */
	
	//   �Կ� ȯ�� ���� - ������
	/* - ��� ȯ�ڸ� ����ؼ� ȯ�ڼ�ī��Ʈ�� -�� �Ǹ� �ȵ˴ϴ�. 
	 * - patient ��ü �迭 ������ �߿������� room�� �ִ� �迭 �����ο����� �����ϼž��մϴ�. 
	 * - �����۾� �Ϸ� �� �� �Կ� ȯ�� �� -- �ϼž��մϴ�. patientCount. ���ο� �־��.
	 * 
	 */
	
	
	//   ȯ�� �Կ� ��ȸ -- �̵μ�
	/*
	 *   1. ȯ���̸����� ȯ�� �Կ���ȸ
	 *   2. ȯ���Կ���¥�� ȯ�� �Կ���ȸ (�ش� �Ⱓ�� �Կ��� ��� ȯ�� ��ȸ�ϴ� �̴ϴ�)
	 *   3. ȯ�� ���̷� ȯ���Կ���ȸ( ���� ���̸� ��� �˻� �����ϰ�)
	 *   
	 */
	
	
	
	
	
	
	
	
	

}

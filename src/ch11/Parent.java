package ch11;

public class Parent {

		public String name;
		protected int age; // ��Ӱ����� Ŭ���������� ���ٰ���
		private int money;
		
		public Parent() { // �����ڴ� �ڽ�Ŭ������ ��ӵ����ʴ´�.
			System.out.println("Parent ������");
		}
		public void printParentInfo() { // name, age��������� ����ϴ� �޼���
			System.out.println("name : "+ name);
			System.out.println("age : "+ age);
		}
		
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		
		
		
		
}

package ThisIsJava;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance(){
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException{ 
		// 사용자 정의 떠넘기기..
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족 : " + (money - balance)+ " 모자람"); 
			// 사용자 정의 예외메세지 출력
		}
		balance -= money;
	}
	



}

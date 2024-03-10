package homework_240311;


//Q19
public class Account {
	final static int MAX_BALANCE = 1000000;
	final static int MIN_BALANCE = 0;
	int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
	}
}

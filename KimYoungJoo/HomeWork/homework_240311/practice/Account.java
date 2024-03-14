package ch06.practice;

public class Account {
	String id, name;
	private int money;

	void CreateAccount(String id, String name, int money) {
		this.id = id;
		this.name = name;
		this.money = money;
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	void ViewAccount() {
		System.out.printf("%s\t%s\t%d\n", id, name, money);
	}

	void InputMoney(int money) {
		if (money > 0)
			this.money += money;
		else
			System.out.println("잘못된 입력입니다.");
	}

	void OutputMoney(int money) {
		if (money > 0 && this.money > money)
			this.money -= money;
		else
			System.out.println("잘못된 입력입니다.");
	}
}

package ch06.practice;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Account[] account = new Account[100];
		// 초기화
		for (int i = 0; i < account.length; i++) {
			account[i] = new Account();
		}
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String select;
		String id, name;
		int money = 0;
		boolean run = true;

		while (run) {
			System.out.println("""
					---------------------------------
					1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료
					---------------------------------""");
			System.out.print("선택> ");
			select = sc.nextLine();
			switch (select) {
				case "1":
					System.out.println("""
							---------
							  계좌생성
							---------""");
					System.out.print("계좌번호: ");
					id = sc.nextLine();
					System.out.print("계좌주: ");
					name = sc.nextLine();
					System.out.print("초기입금액: ");
					money = Integer.parseInt(sc.nextLine());
					account[count].CreateAccount(id, name, money);
					count++;
					break;
				case "2":
					System.out.println("""
							---------
							  계좌목록
							---------""");
					for (int i = 0; i < count; i++) {
						account[i].ViewAccount();
					}
					break;
				case "3":
					System.out.println("""
							---------
							   예금
							---------""");
					System.out.print("계좌번호: ");
					id = sc.nextLine();
					// 계좌번호 찾기
					for (int i = 0; i <= count; i++) {
						if (id.equals(account[i].id)) {
							System.out.print("예금액: ");
							money = Integer.parseInt(sc.nextLine());
							account[i].InputMoney(money);
						}
					}
					break;
				case "4":
					System.out.println("""
							---------
							   출금
							---------""");
					System.out.print("계좌번호: ");
					id = sc.nextLine();
					// 계좌번호 찾기
					for (int i = 0; i <= count; i++) {
						if (id.equals(account[i].id)) {
							System.out.print("출금액: ");
							money = Integer.parseInt(sc.nextLine());
							account[i].OutputMoney(money);
						}
					}
					break;
				case "5":
					run = false;
					System.out.println("시스템을 종료합니다.");
					break;
			}
		}
	}
}

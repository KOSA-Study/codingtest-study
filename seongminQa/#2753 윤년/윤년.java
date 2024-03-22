import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 연도 입력받기
		int year = scan.nextInt();
		
		// 윤년은 4의 배수 and 100의 배수가 아닐 때 or 400의 배수일 때
		// 윤년 % 4 == 0 and (윤년 % 100 != 0 or 윤년 % 400 == 0)
		if(year % 4 == 0 && (year % 100 != 0 | year % 400 == 0)) {
			System.out.println(1);	// 윤년이라면 1을 출력
		} else {
			System.out.println(0);	// 아니면 0을 출력
		}
	}
}
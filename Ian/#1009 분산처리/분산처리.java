
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 수
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int answer = 1; // 초기값을 1로 설정
			a = a % 10; // a의 일의 자리 숫자만 필요

			// 거듭제곱을 계산하지만, 전체 수가 아닌 일의 자리 숫자만 계산
			for (int j = 0; j < b % 4 + 4; j++) { // b % 4가 0일 경우를 처리하기 위해 +4하고 다시 %10을 함
				answer = (answer * a) % 10;
			}

			if (answer == 0)
				answer = 10; // 결과가 0이면 10을 출력, 일의 자리 숫자는 0이 될 수 없으므로
			System.out.println(answer);
		}
		sc.close();
	}
}

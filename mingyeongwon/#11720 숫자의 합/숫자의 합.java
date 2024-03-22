import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 숫자 개수
		int sum = 0;
		String value = sc.next(); // 입력받는 숫자
		
		sc.close();

		for(int i = 0; i < N; i++) {
			sum += value.charAt(i) - '0'; // char -> int 타입 변환 시 - '0' 해주기
			
		}
		
		System.out.println(sum);

	}
}
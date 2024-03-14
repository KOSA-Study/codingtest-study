import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 소수 체크 변수
		int count = 0, check = 0;

		// 입력할 숫자의 개수
		int n = Integer.parseInt(scan.nextLine());
		String[] pn = new String[n];
		pn = scan.nextLine().split(" ");

		// Arrays 패키지 사용해 stream으로 String 배열 int 배열로 변환
		// 저도 사실 이거 잘몰라요 한번 써봤음
		int[] primeNumber = Arrays.stream(pn).mapToInt(Integer::parseInt).toArray();

		for (int i = 0; i < n; i++) {
			if (primeNumber[i] == 2) {
				count++;
			} else {
				for (int j = 2; j <= primeNumber[i]; j++) {
					if (primeNumber[i] % j == 0) {
						if (j == primeNumber[i] && check != -1) {
							count++;
						} else {
							check = -1;
						}
					}
				}
			}
			check = 0;
		}
		System.out.println(count);
	}
}
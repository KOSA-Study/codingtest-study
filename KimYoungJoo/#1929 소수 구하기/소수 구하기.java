import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 소수 체크 변수
		int m = scan.nextInt();
		int n = scan.nextInt();

		boolean[] pn = new boolean[n + 1];
		
		pn[0] = true;
		pn[1] = true;
		

		for (int i = 2; i * i <= n; i++) {
			if (!pn[i])
				for (int j = i * i; j <= n; j += i) {
					pn[j] = true;
				}
		}

		for (int i = m; i <= n; i++) {
			if (!pn[i])
				System.out.println(i);
		}
	}
}

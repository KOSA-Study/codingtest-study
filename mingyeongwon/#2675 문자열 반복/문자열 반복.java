import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int R = sc.nextInt(); // 반복 횟수
			String S = sc.next(); // 입력 문자열 
			


			for (int j = 0; j < S.length(); j++) {

					String alphabet = String.valueOf(S.charAt(j));
					for (int k = 0; k < R; k++) {
							System.out.print(alphabet);
						}

					}
				

			
			System.out.print("\n");
		}

		sc.close();
	}

}
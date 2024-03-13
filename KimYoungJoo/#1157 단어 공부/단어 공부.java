import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		int[] alpha = new int[123];
		int a = 0, max = 0, max_idx = 0;

		for (int i = 0; i < str.length(); i++) {
			a = str.charAt(i);
			if (a >= 97) {
				a -= 32;
			}
			alpha[a] += 1;
		}
		// 최대 중복 체크
		for (int i = 65; i < 123; i++) {
			if (max < alpha[i]) {
				max = alpha[i];
				max_idx = i;
			}
		}

		for (int i = 65; i < 123; i++) {
			if (max_idx == i)
				continue;
			else if (alpha[max_idx] == alpha[i]) {
				max_idx = -1;
				break;
			}
		}
		if(max_idx == -1) {
			System.out.println("?");
		} else {
			System.out.println((char)max_idx);
		}
	}
}
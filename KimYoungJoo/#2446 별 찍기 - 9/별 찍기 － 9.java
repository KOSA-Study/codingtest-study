import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n * 2; i++) {
			if (i < n + 1) {
				if (i == n) {
					continue;
				}
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (n * 2 - 1) - i * 2; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < (n * 2 - 1) - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i * 2 - (n * 2 - 1); j++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}
}
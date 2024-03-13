import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int square = scan.nextInt();
		int sum = square;
		if (square >= 4) {
			for (int i = 2; i <= square / 2; i++) {
				for (int j = i; j <= square / 2; j++) {
					if (i * j <= square) {
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
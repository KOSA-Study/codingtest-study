import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();

		System.out.println(facto(n) / (facto(n - k) * facto(k)));
	}

	public static int facto(int num) {
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact *= i;
		}
		return fact;
	}
}
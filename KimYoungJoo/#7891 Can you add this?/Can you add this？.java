import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count;
		long a, b;
		count = scan.nextInt();

		String str[] = new String[count];
		String plus[];
		long sum[] = new long[count];

		scan.nextLine();

		for (int i = 0; i < count; i++) {
			str[i] = scan.nextLine();
			plus = str[i].split(" ");
			a = Long.parseLong(plus[0]);
			b = Long.parseLong(plus[1]);
			sum[i] = a + b;
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(sum[i]);
		}
		
		scan.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String num = scan.nextLine();
		String[] temp = new String[n];
		int sum = 0;
		temp = num.split("");

		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(temp[i]);
		}

		System.out.println(sum);
	}
}

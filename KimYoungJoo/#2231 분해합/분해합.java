import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int str = scan.nextInt();
		int i = 1;
		while (true) {
			String count = "" + i;
			int num = cn(count);
			if (num == str) {
				System.out.println(count);
				break;
			}
			if (i > str) {
				System.out.println(0);
				break;
			}
			i++;
		}
	}

	public static int cn(String str) {
		String[] temp = str.split("");
		int sum = Integer.parseInt(str);
		for (int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
			// System.out.println(sum);
		}
		return sum;
	}
}
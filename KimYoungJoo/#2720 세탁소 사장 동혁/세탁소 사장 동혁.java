import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int tc = scan.nextInt();
		int cent;
		int temp;
		String[] str = new String[tc];
		int q = 25, d = 10, n = 5, p = 1;
		for (int i = 0; i < tc; i++) {
			cent = scan.nextInt();
			sb.append(cent / q);
			temp = cent % q;
			sb.append(" " + temp / d);
			temp = temp % d;
			sb.append(" " + temp / n);
			temp = temp % n;
			sb.append(" " + temp / p);

			str[i] = sb.toString();
			sb.setLength(0);
		}

		for (String s : str) {
			System.out.println(s);
		}
	}
}
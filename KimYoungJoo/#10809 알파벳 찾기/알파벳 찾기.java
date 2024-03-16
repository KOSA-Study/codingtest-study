import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] a = new int[26];
		for (int i = 0; i < 26; i++) {
			a[i] = -1;
		}
		String s = scan.nextLine();
		char[] alpha = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			alpha[i] = s.charAt(i);
			if (a[alpha[i] - 97] == -1)
				a[alpha[i] - 97] = i;
		}

		for (int i : a)
			System.out.print(i + " ");
	}
}
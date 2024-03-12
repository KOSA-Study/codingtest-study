import java.util.Scanner;

public class Main {
	public static String p(int r, String s) {
		String P = "";
		
		for (char c : s.toCharArray()) {
			for (int i = 0; i < r; i++) {
				P += c;
			}
		}
		return P;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			System.out.println(p(R, S));
		}
	}
}
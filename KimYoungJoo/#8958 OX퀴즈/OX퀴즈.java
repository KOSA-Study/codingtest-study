import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int tc = Integer.parseInt(scan.nextLine());
		String[] ox = new String[tc];
		String arr;
		int score = 0;
		int combo = 0;
		int[] scoreRecord = new int[tc];

		for (int i = 0; i < tc; i++) {
			arr = scan.nextLine();
			for (int j = 0; j < arr.length(); j++) {
				if ("O".equals(String.valueOf(arr.charAt(j)))) {
					combo++;
					score += combo;
				} else
					combo = 0;
			}
			scoreRecord[i] = score;
			score = 0;
			combo = 0;
		}

		for (int i : scoreRecord)
			System.out.println(i);
	}
}
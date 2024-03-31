import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arrayNum = sc.nextInt();

		int[] switchArray = new int[arrayNum];
		int manNum = 0;
		int womanNum = 0;
		int on = 1;
		int off = 0;

		for (int i = 0; i < switchArray.length; i++) {
			switchArray[i] = sc.nextInt();
		}

		int student = sc.nextInt();
		int count = 0;

		while (true) {
			if (student == count) {
				break;
			}

			count++;

			int gender = sc.nextInt();

			switch (gender) {
			case 1:
				manNum = sc.nextInt();
				for (int i = (manNum - 1); i < switchArray.length; i += manNum) {
					switchArray[i] = (switchArray[i] == on) ? off : on;
				}
				break;

			case 2:
				womanNum = sc.nextInt() - 1;
				switchArray[womanNum] = (switchArray[womanNum] == on) ? off : on;

				for (int i = 1; i <= (switchArray.length / 2); i++) {
					if ((womanNum - i) < 0 || (womanNum + i) >= switchArray.length
							|| (switchArray[womanNum - i] != switchArray[womanNum + i])) {
						for (int j = 1; j < i; j++) {
							switchArray[womanNum + j] = (switchArray[womanNum + j] == on) ? off : on;
							switchArray[womanNum - j] = (switchArray[womanNum - j] == on) ? off : on;
						}
						break;
					}
				}
				break;
			}
		}

		for (int i = 0; i < switchArray.length; i++) {
			System.out.print(switchArray[i] + " ");
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}
}
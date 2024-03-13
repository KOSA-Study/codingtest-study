import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] temp = new String[8];
		temp = num.split(" ");
		int[] numArr = new int[8];

		for (int i = 0; i < 8; i++) {
			numArr[i] = Integer.parseInt(temp[i]);
		}
		int count = 0;

		for (int i = 0; i < temp.length - 1; i++) {
			if (numArr[i + 1] == numArr[i] + 1)
				count++;
			else if (numArr[i + 1] == numArr[i] - 1)
				count--;
		}
		if (count == 7)
			System.out.println("ascending");
		else if (count == -7)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}
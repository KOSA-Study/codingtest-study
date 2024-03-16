import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		String sumNum = Integer.toString(num1 * num2 * num3);
		String[] temp = new String[sumNum.length()];
		int[] count = new int[10];
		temp = sumNum.split("");
		int j;

		for (int i = 0; i < temp.length; i++) {
			j = Integer.parseInt(temp[i]);
			count[j]++;
		}

		for (int i : count) {
			System.out.println(i);
		}
	}
}
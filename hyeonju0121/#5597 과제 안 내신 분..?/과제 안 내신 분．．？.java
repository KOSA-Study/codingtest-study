import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] check = new boolean[30];
		
		for (int i = 0; i < 28; i++) {
			int temp = sc.nextInt();
			
			check[temp - 1] = true;
		}
		
		int cnt = 0;		
		while (cnt != 2) {
			for (int i = 0; i < check.length; i++) {
				if (!check[i]) {
					cnt++;
					System.out.print((i + 1) + "\n");
				}
			}
		}
	}
}
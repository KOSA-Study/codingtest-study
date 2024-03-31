import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		boolean[][] check = new boolean[102][102];

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x + 1; j < x + 11; j++) {
				for (int k = y + 1; k < y + 11; k++) {
					check[j][k] = true;
				}
			}
		}

		int result = 0;
		boolean[] partner = new boolean[4];
		for (int i = 0; i < check.length; i++) {
			for (int j = 1; j < check[i].length; j++) {
				partner[0] = check[j - 1][i]; 
				partner[1] = check[j][i]; 
				partner[2] = check[i][j - 1]; 
				partner[3] = check[i][j]; 

				if (partner[0] != partner[1]){
					result++;
				} 
				if (partner[2] != partner[3]) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}

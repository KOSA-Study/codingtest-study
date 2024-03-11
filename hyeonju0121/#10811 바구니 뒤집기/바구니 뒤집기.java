import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		int[] copy = new int[N];
		for (int a = 0; a < N; a++) {
			arr[a] = a + 1;
			copy[a] = a + 1;
		}
		
		for (int x = 0; x < M; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int idx = i - 1;

			for (int y = j - 1; y >= i - 1; y--) {
				arr[idx] = copy[y];
				idx++;
			}
			
			for (int k = 0; k < arr.length; k++) {
				copy[k] = arr[k];
			}
		}
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for (int z = 0; z < N; z++) {
			arr[z] = z + 1;
		}
		
		for (int x = 0; x < M; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int temp = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = temp;
		}
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
	}
}

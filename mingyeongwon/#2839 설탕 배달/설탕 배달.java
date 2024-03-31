import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int result = 0;
		int[] array = new int[3];
		
		

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (N % 5 == 0) {
					result = N / 5;
					array[0] = result;
				} else if ((5*i) + (3*j) == N) {
					result = i + j;
					array[1] = result;
				} else if (N % 3 == 0) {
					result = N / 3;
					array[2] = result;
				} else {
					continue;
				}
			}
		}
		
		Arrays.sort(array);
		if(array[2] == 0) {
			System.out.println(-1);
		} else {
			for(int arr : array) {
				if(arr != 0) {
					System.out.println(arr);
					break;
				}
			}
		}

	}

}
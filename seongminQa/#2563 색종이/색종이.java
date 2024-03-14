import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arry = new int[100][100];
		int cnt=0;
		int sum=0;
		int num = scan.nextInt();
		while(cnt < num) {
			int first = scan.nextInt();
			int second = scan.nextInt();
			for(int i=first; i<first+10; i++) {
				for(int j=second; j<second+10; j++) {
					arry[i][j] = 1;
				}
			}
			cnt++;
		}
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				sum += arry[i][j];
			}
		}
		System.out.print(sum);
	}
}
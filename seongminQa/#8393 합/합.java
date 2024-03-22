import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int result=0;
		
		// 1부터 n까지 계속해서 덧셈 누적
		for(int i=1; i<=n; i++) {
			result += i;
		}
		System.out.print(result);
	}
}
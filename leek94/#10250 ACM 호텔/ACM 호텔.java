import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		int[] answer =  new int[T];
		
		int floor = 0;
		int ho = 0;
		
		
		for( int i = 0; i<T; i++) {
			int H = scanner.nextInt();
			int W = scanner.nextInt();
			int N = scanner.nextInt();
			
			if(N%H == 0) {
				
				floor = H*100;
				ho = N/H;
				answer[i] = floor + ho;
			}else {
				floor = (N%H)*100;
				ho = N/H +1;
				answer[i] = floor + ho;
				// 100층에 100명이면 예외 발생
			}
		}
		
		for(int i = 0; i< T; i++) {
			System.out.println(answer[i]);
		}
		
	}

}

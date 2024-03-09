import java.util.Scanner;

public class Main {
	public static int reverseInt(int s) {
		int answer = 0;
		
		String origin = String.valueOf(s);
		String[] arr = origin.split("");
		
		String temp = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			temp += arr[i];
		}
		
		answer = Integer.parseInt(temp);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int answer = 0;
	
		int reverseA = reverseInt(A);
		int reverseB = reverseInt(B);
		
		answer = reverseA > reverseB ? reverseA : reverseB;
		
		System.out.println(answer);	
	}
}

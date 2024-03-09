import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] arr = new String[T];
	
		
		for (int i = 0; i < arr.length; i++) {
			String str = sc.next();
			
			String temp3 = String.valueOf(str.charAt(0)) 
					+ String.valueOf(str.charAt(str.length() - 1));
			
			arr[i] = temp3;
		}
		
		for (String str : arr) {
			System.out.println(str);
		}
		
	}
}
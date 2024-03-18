import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		String star = "";
		
		for(int i=1; i<=t; i++) {
			for(int j=t-i; j>0; j--) {
				System.out.print(" ");
			}
			star += "*";
			System.out.println(star);
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = Integer.parseInt(scan.nextLine());
		String[] s = new String[t];
		int[] num = new int[t];
		String[] str = new String[t];
		String[] temp = new String[2]; 
		
		for(int i=0; i<t; i++) {
			s[i] = scan.nextLine();
			temp = s[i].split(" ");
			num[i] = Integer.parseInt(temp[0]);
			str[i] = temp[1];
		}
		
		for(int i=0; i < t; i++) {
			for(int j=0; j < str[i].length(); j++) {
				for(int k=0; k < num[i]; k++) {
					System.out.print(str[i].charAt(j));
				}
			}
			System.out.println();
		}
	}
}
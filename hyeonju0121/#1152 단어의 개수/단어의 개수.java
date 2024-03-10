import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		if (str.substring(0, 1).equals(" ") && str.length() > 1) {
			str = str.substring(1);
		}
        
		String[] strArr = str.split(" ");
		
		System.out.println(strArr.length);
	}
}
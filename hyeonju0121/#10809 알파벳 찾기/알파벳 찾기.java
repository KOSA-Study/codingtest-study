import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		String[] strArr = S.split("");
		
		int[] alphaSize = new int[26];
		Arrays.fill(alphaSize, -1);
		
		for (int i = 0; i < strArr.length; i++) {
			int num = strArr[i].charAt(0);
			
			if(alphaSize[num - 97] != -1) {
				continue;
			} alphaSize[num - 97] = i;
		}
		
		for (int temp : alphaSize) {
			System.out.print(temp + " ");
		}
	}
}
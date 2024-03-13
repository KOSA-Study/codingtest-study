import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int bag = Integer.MAX_VALUE;
		ArrayList<Integer> minbag = new ArrayList<Integer>();
		int temp;

		for (int i = 0; i * 5 <= n; i++) {
			temp = n - i * 5;
			if (temp % 3 == 0) {
				minbag.add(i+temp/3);
			}
		}

		
		
		if(minbag.isEmpty())
			bag = -1;
		else {
			for (int a : minbag) {
				if(bag > a)
					bag = a;
			}
		}			
		
		System.out.println(bag);
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int t, h, w, n;
		
		String[] arry = new String[3];
		
		Scanner scan = new Scanner(System.in);
		
		t = Integer.parseInt(scan.nextLine());
		
		int[] room = new int[t];
		int[] floor = new int[t];
		
		for(int i=0; i<t; i++) {
			
			arry = scan.nextLine().split(" ");
			h = Integer.parseInt(arry[0]);
			w = Integer.parseInt(arry[1]);
			n = Integer.parseInt(arry[2]);
			
			
			if(n%h == 0) {
				floor[i] = h;
				room[i] = (n / h);
			}else {
				floor[i] = n % h;
				room[i] = (n / h) + 1;
			}
			
		}
		
		for(int j=0; j<t; j++) {
			System.out.println(floor[j]*100 + room[j]);
		}
		
	}

}

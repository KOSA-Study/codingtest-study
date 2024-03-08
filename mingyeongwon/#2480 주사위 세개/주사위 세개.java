import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		int result;
		int max;
		
		
		if((a==b) && (b==c)) {
			result = 10000 + (a*1000);
		} else if(((a==b)&&(b!=c)) || ((a==c)&&(b!=c))) {
			result = 1000 + (a*100);
		} else if((b==c) && (c!=a)) {
			result = 1000 + (b*100);
		} else {
			max = a>b? (b>c? a: (a>c? a: c)): (b>c? b: c);
			result = max * 100;
		}
		
		System.out.println(result);

	}

}

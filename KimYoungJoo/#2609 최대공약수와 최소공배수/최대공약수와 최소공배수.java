import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int temp;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		temp = gcd(a, b);
		System.out.println(temp + "\n" + (a * b) / temp);
	}

	// 최대공약수 - 유클리드 호제법
	public static int gcd(int a, int b) {
		int temp;
		while (true) {
			if (a % b == 0)
				break;
			else {
				temp = b;
				b = a % b;
				a = temp;
			}
		}
		return b;
	}
}
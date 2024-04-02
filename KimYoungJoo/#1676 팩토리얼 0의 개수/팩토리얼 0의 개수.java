import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		BigInteger f = new BigInteger("1");
		int count = 0;
		for (int i = n; i > 0; i--) {
			BigInteger bn = new BigInteger("" + i);
			f = f.multiply(bn);
		}
		String str = f.toString();
		String[] facto = str.split("");

		for (int i = facto.length - 1; i >= 0; i--) {
			if (facto[i].equals("0"))
				count++;
			else
				break;
		}

		System.out.println(count);
	}
}

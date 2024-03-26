import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String notCroatia = word;

		for (int i = 0; i < croatia.length; i++) {
			notCroatia = notCroatia.replace(croatia[i], "0");
		}
		System.out.println(notCroatia.length());
	}
}

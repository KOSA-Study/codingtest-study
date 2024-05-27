import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] word = new String[n];
		
		for(int i=0; i<n; i++) {
			word[i] = br.readLine();
		}
		for(int i=0; i<n; i++) {
			System.out.println(word[i].charAt(0)+""+word[i].charAt(word[i].length()-1));
		}
	}
}
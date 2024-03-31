import java.io.*;
import java.util.StringTokenizer;

// EOF 처리 연습
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";
		StringTokenizer st;
		
		while((str = br.readLine()) != null && !str.isEmpty()) {
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		bw.close();
	}
}
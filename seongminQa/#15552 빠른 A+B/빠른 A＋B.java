import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// BufferedReader와 InputStreamReader로 한 줄 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter와 OutputStreamWriter로 값 저장하기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스 갯수 입력받기
		int t = Integer.parseInt(br.readLine());

		// 테스트 케이스 수만큼 한 줄(라인) 입력받고 계산하기
		for(int i=0; i<t; i++) {
			// StringTokenizer로 공백마다 값 저장하기
			StringTokenizer st = new StringTokenizer(br.readLine());
			// write로 출력할 값 저장해놓는다.
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		// write로 저장했던 값들을 화면에 뿌려준다.
		bw.close();

	}
}

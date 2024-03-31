import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine(); // 입력받기 
		
		StringTokenizer st = new StringTokenizer(str, " "); // 문자열 분리
		System.out.println(st.countTokens());
		
		
		
		sc.close();
		
	}

}
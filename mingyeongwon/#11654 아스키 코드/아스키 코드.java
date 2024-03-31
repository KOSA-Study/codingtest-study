import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char value = sc.next().charAt(0); // String -> char
		
		sc.close();

		System.out.println((int) value);  // 아스키코드 출력하기
		
	}
}
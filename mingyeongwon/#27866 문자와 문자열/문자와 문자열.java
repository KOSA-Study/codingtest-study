import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine(); // 해당 인덱스 값 출력하기
		System.out.println(value.charAt(sc.nextInt() - 1));
		
		sc.close();
	}
}
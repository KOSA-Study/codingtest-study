import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String num1 = sc.next(); // 숫자 입력받기
		String num2 = sc.next();
		
		String reverseNum1 = "";
		String reverseNum2 = "";
		
		for(int i = 2; i >= 0; i--) { // 숫자 거꾸로 하기 
			reverseNum1 += num1.charAt(i);
			reverseNum2 += num2.charAt(i);
		}
		
		if(Integer.parseInt(reverseNum1) > Integer.parseInt(reverseNum2)) { // 큰 값 출력하기
			System.out.println(reverseNum1);
		} else {
			System.out.println(reverseNum2);
		}
		
		sc.close();
		
	}

}
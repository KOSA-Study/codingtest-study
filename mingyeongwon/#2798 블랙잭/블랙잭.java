import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 카드 개수
		int M = sc.nextInt(); // 최댓값 
		int[] array = new int[N]; // 카드 번호 입력받는 배열 
		int sum = 0; // 최대 합계
		
		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N-2; i++) {
			for (int j = i+1; j < N-1; j++) {
				for(int k = j+1; k < N; k++) {
					int temp = array[i] + array[j] + array[k]; // 임시 합계
					if(sum <= temp && temp <= M) {
						sum = temp;
					}
					
				}
			}
		}
		System.out.println(sum);	
		
	}

}
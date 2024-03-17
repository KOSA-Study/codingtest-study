import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] array = new double[sc.nextInt()];
		double sum = 0;

		for (int i = 0; i < array.length; i++) { // 입력 받기
			array[i] = sc.nextDouble();
		}

		sc.close();

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			array[i] = (array[i] * 100) / array[array.length - 1];
			sum += array[i];
		}

		System.out.println(sum / array.length); // 평균 출력

	}
}
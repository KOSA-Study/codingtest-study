import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int count = 0;
		int number;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while (true) {
			int a = splitFunc(Integer.toString(count));
			number = count + a;
			while (arr.size() <= number) {
                arr.add(0); // 초기값은 0으로 설정
            }
			arr.set(number, 1);
			count++;
			if(count == 10000) {
				break;
			}
		}
		
		for(int i=0; i<10000; i++) {
			if(arr.get(i) == 0) {
				System.out.println(i);
			}
		}

	}

	static int splitFunc(String str) {
		int[] num = new int[str.length()];
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			num[i] = Character.getNumericValue(str.charAt(i));
			sum += num[i];
		}

		return sum;
	}
}
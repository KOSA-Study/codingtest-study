import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static String find(HashMap<String, String> map, String str) {
		String result = "";
		for (String key : map.keySet()) {
			if (map.get(key).equals(str)) {
				return key;
			} else if (key.equals(str) ) {
				return map.get(key);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			String poketmon = sc.next();
			
			map1.put(poketmon, String.valueOf(i + 1));
			map2.put(String.valueOf(i + 1), poketmon);
		}
		
		for (int j = 0; j < M; j++) {
			String str = sc.next();
			
			if (map1.containsKey(str)) {
				System.out.println(map1.get(str));
			} else if (map2.containsKey(str)) {
				System.out.println(map2.get(str));
			}
		}
	}
}

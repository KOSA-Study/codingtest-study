import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		HashMap<String, Integer> map = new HashMap<>();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		
		for (int i = 0; i < M; i++) {
			String str = sc.next();
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		
		ArrayList<String> name = new ArrayList<>();
		
		int num = 0;
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				num++;
				name.add(key);
			}
		}
		
		name.sort(null);
		
		System.out.println(num);
		for (String n : name) {
			System.out.println(n);
		}
	}
}
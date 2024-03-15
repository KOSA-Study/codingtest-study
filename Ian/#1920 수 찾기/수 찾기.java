import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Set<Integer> A = new HashSet<>();
		for (int i = 0; i <N; i++) {
			A.add(sc.nextInt());
		}
		int M = sc.nextInt();
		int[] target = new int[M];
		for (int i = 0; i < target.length; i++) {
			target[i]=sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			if(A.contains(target[i])) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
    sc.close();
	}

}
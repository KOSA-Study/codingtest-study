import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] tri = new int[3];
		int max = 0;
		int maxIdx = 0;
		ArrayList<String> answer = new ArrayList<String>();
		while (true) {
			String[] str = scan.nextLine().split(" ");
			for (int i = 0; i < str.length; i++) {
				tri[i] = Integer.parseInt(str[i]);
				if (max < tri[i]) {
					max = tri[i];
					maxIdx = i;
				}
			}
			String check = tri[0] + " " + tri[1] + " "+ tri[2];
			if(check.equals("0 0 0"))
				break;
			max = 0;
			for (int i = 0; i < str.length; i++) {
				if (i != maxIdx) {
					max += Math.pow(tri[i], 2);
				}
			}

			if (Math.pow(tri[maxIdx], 2) == max) {
				answer.add("right");
			} else {
				answer.add("wrong");
			}
			max = Integer.MIN_VALUE;
		}
		
		for(String s : answer) {
			System.out.println(s);
		}
	}
}
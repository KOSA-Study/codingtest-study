import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> v = new Stack<String>();
		int t = Integer.parseInt(scan.nextLine());
		String[] vps;
		String[] answer = new String[t];
		boolean noCheck = true;
		for (int i = 0; i < t; i++) {
			vps = scan.nextLine().split("");
			for (int j = 0; j < vps.length; j++) {
				try {
					if (vps[j].equals("(")) {
						v.add("data");
					} else if (vps[j].equals(")")) {
						v.pop();
					}
				} catch (EmptyStackException e) {
					noCheck = false;
					break;
				}
			}
			if (v.isEmpty() && noCheck) {
				answer[i] = "YES";
			} else {
				answer[i] = "NO";
			}
			noCheck = true;
			v.clear();
		}
		
		for(String i : answer) {
			System.out.println(i);
		}
	}
}
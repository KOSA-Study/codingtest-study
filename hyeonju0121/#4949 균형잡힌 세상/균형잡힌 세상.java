import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static String solution(String str) {
		String answer = "yes";
		
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if ((c == '(') || (c == '['))  {
				stack.push(c);
			} else if ((stack.isEmpty() && c == ')') ||
					(stack.isEmpty() && c == ']')) {
				return "no";
			} else if ((c == ')') && stack.peek().equals('(')) {
				stack.pop();
			} else if ((c == ']') && stack.peek().equals('[')) {
				stack.pop();
			} else if ((c == ')') && !stack.peek().equals('(')) {
				return "no";
			} else if ((c == ']') && !stack.peek().equals('[')) {
				return "no";
			}
		}
		if(!stack.isEmpty()) {
			return "no";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		while(true) {
			str = sc.nextLine();
			if (str.equals(".")) {
				break;
			}
			System.out.println(solution(str));
		}
	}
}

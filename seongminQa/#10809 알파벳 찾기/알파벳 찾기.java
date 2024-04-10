import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// 단어 입력에 BufferedReader를 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String 타입으로 입력을 받음
		String word = br.readLine();
		// 알파벳 a~z까지는 총 26개
		int[] abc = new int[26];
		// 알파벳 배열의 값을 -1로 초기화
		for(int i=0; i<26; i++) {
			abc[i] = -1;
		}
		// 단어의 길이만큼 for문을 반복하여 해당 인덱스의 값 변경
		// String.charAt(인덱스)는 인덱스 맞는 문자를 반환
		// String.indexOf(문자)는 String 안에 해당 문자가 있는 인덱스 값을 반환 
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			abc[ch - 'a'] = word.indexOf(ch);
		}
		for(int i=0; i<26; i++) {
			System.out.print(abc[i] + " ");
		}
	}
}
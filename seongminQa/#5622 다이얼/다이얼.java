import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// BuffredReader로 입력받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 단어 하나하나를 String 배열로 받아 확인
		String[] word = br.readLine().split("");
		// 최종 시간을 계산하는 변수선언과 초기화
		int result = 0;
		// 반복문을 돌려 계산
		for(int i=0; i<word.length; i++) {
			if(word[i].contains("A") || word[i].contains("B") || word[i].contains("C")) {
				result += 2;
			}
			else if(word[i].contains("D") || word[i].contains("E") || word[i].contains("F")) {
				result += 3;
			}
			else if(word[i].contains("G") || word[i].contains("H") || word[i].contains("I")) {
				result += 4;
			}
			else if(word[i].contains("J") || word[i].contains("K") || word[i].contains("L")) {
				result += 5;
			}
			else if(word[i].contains("M") || word[i].contains("N") || word[i].contains("O")) {
				result += 6;
			}
			else if(word[i].contains("P") || word[i].contains("Q") || word[i].contains("R")
					|| word[i].contains("S")) {
				result += 7;
			}
			else if(word[i].contains("T") || word[i].contains("U") || word[i].contains("V")) {
				result += 8;
			}
			else if(word[i].contains("W") || word[i].contains("X") || word[i].contains("Y")
					|| word[i].contains("Z")) {
				result += 9;
			}
			else {
				result += 10;
			}
			result++;
		}
		System.out.println(result);
	}
}
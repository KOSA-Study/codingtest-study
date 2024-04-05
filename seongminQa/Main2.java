package first.problem04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		/*
		허술한 조이는 영어 소문자로 만든 허술한 비밀번호를 사용한다. 
		그리고 실제 비밀번호를 다른 알파벳으로 변환한 암호를 포스트잇에 적어놓는다. 
		실제 비밀번호를 찾는 프로그램을 만들어, 이렇게 간단한 변환으로 암호를 만드는 
		허술한 조이에게 경각심을 심어주자. 암호를 실제 비밀번호를 다시 바꾸는 방법은 다음과 같다. 
		예를 들어 소문자 ‘h’는 4번째 뒤 문자인 ‘l’로 변환한다. 
		소문자 ‘y’는 4번째 뒤 문자인 ‘c’로 변환한다. 알파벳의 순서를 따질 때, 
		마지막 알파벳인 z 다음에는 a가 오는 것으로 계산한다. 
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 비밀번호 입력받는 변수 passwordA
		String passwordA = br.readLine();
		// 실제 비밀번호를 저장할 passwordB
		String passwordB = "";
		
		// for 반복문을 이용하여 입력한 비밀번호를 인덱스마다 검사하여 실제 비밀번호로 변환 
		for(int i=0; i<passwordA.length(); i++) {
			// 아스키코드표를 이용.
			// 소문자 'z'는 십진법 122에 해당
			// 'z'의 수를 넘어가지 않는다면 if문을 이용하여 변환
			if((char)(passwordA.charAt(i) + 4) <= 'z') {
				passwordB += (char)(passwordA.charAt(i) + 4);		
			} else {  // 'z'의 수(122)를 넘어간다면 다시 'a'의 수 (97)부터 시작하여 변환
				passwordB += (char)(passwordA.charAt(i) + 4 - 26);
			}
		}
		System.out.println(passwordB);
	}
}

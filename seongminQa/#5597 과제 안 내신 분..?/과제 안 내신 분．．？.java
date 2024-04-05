import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		// BufferedReader로 입력받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ArrayList로 입력받은 값들을 인덱스를 활용하여 저장할 것이다.
		ArrayList<Integer> al = new ArrayList<>();
		
		// ArrayList에 1~30의 값을 채워 넣는다 (학생번호)
		for(int i=0; i<30; i++) {
			al.add(i+1);
		}
		// 학생번호를 28번 입력받는 반복문
		for(int i=0; i<28; i++) {
			// 입력받은 학생의 번호의 인덱스를 저장하는 변수 선언과 동시에 초기화
			int check = al.indexOf(Integer.parseInt(br.readLine()));
			// 해당 인덱스의 학생 번호 제거
			al.remove(check);
		}
		// ArrayList 정렬 방법 (오름차순 정렬) // Collection을 사용하는 방법도 있다.
		al.sort(Comparator.naturalOrder());
		
		// ArrayList에 남은 학생의 번호를 출력 (과제를 제출하지 않은 학생번호)
		for(Integer i : al) {
			System.out.println(i);
		}
	}
}
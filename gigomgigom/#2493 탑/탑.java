import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//생각해보니 값만 담을거였는데 배열로 해도 됬지않았을까..
//괜히 객체 개념까지 끌어다 써서 머리 아프게 하지않았나 싶다..
class Tower { //타워 클래스 생성
	int height; //높이 필드
	int index; //순서 필드
	
	Tower(int height, int index) { //객체 초기화용 생성자
		this.height = height;
		this.index = index; 
	}
}

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int towerCnt; //타워의 갯수
		
		towerCnt = Integer.parseInt(br.readLine()); //타워의 갯수 입력
		
		//입력받은 타워들의 높이들을 공백에 맞춰 토큰으로 분리
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		
		//출력할 문자열을 만들어줄 StringBuilder 객체를 생성한다.
		//이유: 타워의 갯수의 범위가 넓어지게되면 문자열 객체의 폐기, 생성 빈도수가 늘어나기때문
		StringBuilder sb = new StringBuilder();
		
		//Tower 객체를 담을 배열 선언
		Tower[] towerArray = new Tower[towerCnt];
		int index = 0; //while문 에서 towerArray 배열 요소추가할때 증감식에 사용할 변수
		
		//Tower높이를 대조할때 이용할 스택 객체를 생성한다.
		Stack<Tower> laserDetect = new Stack<>();
		
		//String토크나이저에서 분리한 토큰(높이값) 데이터와 (인덱스+1) 데이터를 매개값으로 전달해 Tower 객체를 생성한다.
		//그 이후 생성한 Tower객체를 towerArray배열에 입력받은 순서대로 넣어준다.
		while(st.hasMoreTokens()) {
			int height = Integer.parseInt(st.nextToken());
			towerArray[index] = new Tower(height, index + 1);
			index++; //towerArray[index]에 객체를 대입할때마다 다음 값을 넣을 인덱스를 맞춰준다.
		}
		
		for(int i = 0; i < towerArray.length; i++) {
			
			while(!laserDetect.empty()) { //만약 스택에 Tower객체가 존재한다면
				//그리고 그 스택이 갖고있는 객체의 높이필드값이 towerArray[i](대조할 객체)의 높이값보다 크면
				if(laserDetect.peek().height >= towerArray[i].height) {
					sb.append(laserDetect.peek().index)					
					  .append(" ");
					//스택 내부 객체가 갖고있는 필드값을 StringBuilder에 추가한다.
					break;
					//값을 찾았으니 while탈출!
				}
				laserDetect.pop();//앞에 대조한 결과가 false가 나온다면 스택에 존재하는 객체 데이터를 pop한다.
			}
			
			if(laserDetect.empty()) { //처음에 입력받은 타워이거나 while문 내부의 if조건식이 false가 나온다면 0의 값을 도출
				sb.append(0 + " ");
			}
			
			laserDetect.push(towerArray[i]); //배열에서 입력받은 객체 데이터를 다음 데이터와 비교하기 위해 스택에 푸쉬한다.
		}
		
		
		System.out.println(sb); // 반복문이 종료가 되면 StringBuilder에서 완성된 문자열을 출력한다.
	
		
		
	}
}
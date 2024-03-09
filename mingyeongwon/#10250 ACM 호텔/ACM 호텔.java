import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     int T = sc.nextInt(); // 테스트 데이터 개수
     String[] values = new String[T];
     String print = "";
     
     
     for(int i=0; i<T; i++) {
        int H = sc.nextInt(); // 층 : 1 ~ H
        int W = sc.nextInt(); // 방 개수 : 1 ~ W
        int N = sc.nextInt(); // 고객 순서 : 1 ~ N
        
        int people = 0;
        
        for(int j=0; j<W; j++) {
           for(int k=0; k<H; k++) {
        	  people++;
              if(people == N) {
                 if((j + 1) < 10) {
                    print = (k+1) + "0" + (j+1);
                 } else {
                    print = (k+1) + String.valueOf(j+1);
                 }
                 
              } 
              
           }
           
        }
        values[i] = print;
     }
     
     for(int i=0; i<T; i++) {
        System.out.println(values[i]);
     }
     
    
    
  }

}
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt(); //바구니 개수
    int M = sc.nextInt(); // 교환 횟수
    
    int[] arr = new int[N];
    
    for(int a=0; a<N; a++) {
      arr[a] = a+1;
    }
    
    for(int a=0; a<M; a++) {
      int i = sc.nextInt();
      int j = sc.nextInt();
      int i1 = arr[i-1];
      int j1 = arr[j-1];
      arr[i-1] = j1;
      arr[j-1] = i1;
    }
    
    for(int a=0; a<N; a++) {
      System.out.print(arr[a] + " ");
    }
    
    sc.close();

  }

}

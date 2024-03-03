import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    int D = C / 60;
    int E = C % 60;
    
    if((B+E) >= 60) {
      A += (D+1);
      B += (E-60);
    } else {
      A += D;
      B += E;
    }
    
    if(A > 23) {
      A -= 24;
    }
    
//    
//    b+e >= 60 ; a : a+d + 1, b : b+e-60 
//    b+e < 60 ; a : a+d, b : b+e
//    a+d > 23 : a+d-24
//   
    System.out.println(A + " " + B);
    
  }

}

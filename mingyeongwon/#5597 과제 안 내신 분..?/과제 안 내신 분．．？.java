import java.util.*;

public class Main {

  public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     int[] students = new int[30];
     
     for(int i=0; i<28; i++) {
    	 int number = sc.nextInt();
    	 students[number-1] = number;
     }
     
     for(int i=0; i<students.length; i++) {
    	 if(students[i] == 0) {
    		 System.out.println(i+1);
    	 }
     }
     
     
     
  }
}
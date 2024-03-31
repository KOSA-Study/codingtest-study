import java.util.*;

public class Main {

  public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     int count = 0;
     int[][] square = new int[100][100];
     
     for(int i=0; i<n; i++) {
    	 int x = sc.nextInt();
    	 int y = sc.nextInt();
    	 
    	 for(int j=x; j<x+10; j++) {
    		 for(int k=y; k<y+10; k++) {
    			 if(square[j][k] == 0) {
    				 square[j][k] = 1;
    			 }
    		 }
    	 }
     }
     
     for(int i=0; i<square.length; i++) {
    	 for(int j=0; j<square[i].length; j++) {
    		 if(square[i][j] == 1) {
    			 count++;
    		 }
    	 }
     }
     System.out.println(count);
     


     
     
     
  }
}
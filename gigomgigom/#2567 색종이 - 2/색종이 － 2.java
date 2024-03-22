import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int overlapCnt = 0;

        int[][] isOverlap = new int[101][101];
        
        int paperCnt = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < paperCnt; i++) {
            String[] positionInput = sc.nextLine().split(" ");
            int x = Integer.parseInt(positionInput[0]);
            int y = Integer.parseInt(positionInput[1]);
            for(int j = x; j < (x + 10); j++) {
                for(int k = y; k < (y + 10); k++) {
                    isOverlap[j][k] = 1;
                    }
                }
            }
        
        for(int index1 = 0; index1 < isOverlap.length; index1++) {
            for(int index2 = 0; index2 < isOverlap[index1].length; index2++) {
                if(isOverlap[index1][index2] != 1) {
                	int collisionNum = 0;
                	if(index1 != 0) {
                		if(isOverlap[index1 - 1][index2] == 1) {collisionNum++;}
                	}
                	if(index1 != 100) {
                		if(isOverlap[index1 + 1][index2] == 1) {collisionNum++;}
                	}
                	if(index2 != 0) {
                		if(isOverlap[index1][index2 - 1] == 1) {collisionNum++;}
                	}
                	if(index2 != 100) {
                		if(isOverlap[index1][index2 + 1] == 1) {collisionNum++;}
                	}
                	overlapCnt += collisionNum;
                }
            }
        }
        
        System.out.println(overlapCnt);
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int findCard(int[] cards, int card) {
        int left = 0;
        int right = cards.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (cards[mid] < card) {
                left = mid + 1;
            } else if (cards[mid] > card) {
                right = mid - 1;
            } else {
                return 1; // 카드를 찾은 경우
            }
        }
        return 0; // 카드를 찾지 못한 경우
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards); 

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            if (findCard(cards, Integer.parseInt(st.nextToken())) == 1) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush(); 
        bw.close(); 
    }
}

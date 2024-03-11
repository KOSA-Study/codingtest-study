import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        double arr[] = new double[t];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double tot = 0;
        Arrays.sort(arr);

        for(int j = 0; j < arr.length; j++){
            tot += arr[j]/arr[arr.length-1]*100;
        }
        System.out.println(tot/t);
    }
}
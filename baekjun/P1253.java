package baekjun;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a[]= new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int count = 0;
        for(int k=0; k<N; k++){
            int i=0, j=N-1;
            while(i<j){
                if(a[i]+a[j]==a[k]){
                    if(i != k && j != k) {
                        count++;
                        break;
                    }else if(i == k){
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                }else if(a[i]+a[j] < a[k]){
                    i++;
                }else{
                    j--;
                }

            }
        }
        System.out.println(count);
        br.close();

    }
}

package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int a[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int count = 0, i=0, j=N-1;
        while(i<j){
            if(a[i]+a[j] < M){
                i++;
            }else if(a[i]+a[j]>M){
                j--;
            }else{
                i++;
                j--;
                count++;
            }
        }
        System.out.println(count);
        br.close();

    }
}

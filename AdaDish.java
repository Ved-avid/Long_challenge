import java.lang.*;
import java.util.*;
import java.io.*;

class AdaDish{
    static private Scanner sc = new Scanner(System.in);
    static public void main(String[] args) throws IOException{
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++) a[i]=sc.nextInt();
            if(n == 1) System.out.println(a[0]);
            else{
             Arrays.sort(a);
              int sum = 0, diff = 0;
                sum = a[n-1];
                diff = a[n-1]-a[n-2];

                for(int i = n-3; i>=0; i--){
                    if(diff < a[i]){
                        diff = a[i] - diff;
                        sum+=diff;
                    }
                    else if(diff>=a[i]){
                        diff = diff-a[i];
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
/* September Long Challenge 2020 */

import java.lang.*;
import java.util.*;
import java.io.*;

public class AdaMat{
    static private Scanner sc = new Scanner(System.in);
    static public void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 1;i<n;i++){
                if(a[0][i]!=(i+1)){
                    list.add(i);
                }
            }
           int s = 0;
            Collections.reverse(list);
            boolean T = false;
            for(int i = n-1;i>0;i--){
                if(list.contains(i) && T == false){
                    s++;
                    T = true;
                }
                if(!list.contains(i) && T == true){
                    s++;
                    T = false;
                }
            }
            System.out.println(s);
            
        }
    }
}

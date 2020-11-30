/* August Challenge 2020 */


import java.lang.*;
import java.io.*;
import java.util.*;

class LinChess{
    static private Scanner sc = new Scanner(System.in);
    static public void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            List<Long> list = new ArrayList<>();
            int i =0;
            while(i<n){
                a[i] = sc.nextLong();
                i++;
            }
            int d = 0;
            while(d<n){
                if(k%a[d]==0){
                    list.add(a[d]);
                }
                d++;
            }
            if(list.size()==0){
                System.out.println(-1);
            }
            else{
                Collections.sort(list);
                long ans = list.get(list.size()-1);
                System.out.println(ans);
            }
        }
    }
}

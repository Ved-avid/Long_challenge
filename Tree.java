/* September Long Challenge 2020 */

import java.lang.*;
import java.util.*;
import java.io.*;

class Tree{
    static private Scanner sc = new Scanner(System.in);
    static public void main(String[] args){
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i<n;i++){
                int x = sc.nextInt();
                set.add(x);
            }
            Iterator it = set.iterator();
            int ans = 0;
            while(it.hasNext()){
                if((int)it.next() != 0){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

class Restore{
    static private Scanner sc = new Scanner(System.in);
    static public void main(String[] args) throws IOException{
        try{
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0; i<n;i++){
                    a[i] = sc.nextInt();
                }
                
                Map<Integer, Integer> map = new HashMap<>();
                ArrayList<Integer> list = new ArrayList<>();
                int h = 2;
                for(int i = n-1;i>=0;i--){
                    if(!map.containsKey(a[i])){
                        map.put(a[i],h);
                        list.add(h);
                        h++;
                    }
                    else{
                        list.add(map.get(a[i]));
                    }
                }
                for(int i = list.size()-1;i>=0;i--){
                    System.out.print(list.get(i)+" ");
                }
                System.out.println();
            }
        }catch(Exception e){
            return;
        }
    }
}
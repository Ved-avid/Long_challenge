// @ -- Dev -- @ //

// 16 - Nov - 2020 //

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class IronMagnet{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] inp = br.readLine().split(" ");
            int n = Integer.parseInt(inp[0]);
            int k = Integer.parseInt(inp[1]);
            String s = br.readLine();
            Queue<Integer> iron = new LinkedList<Integer>();
            Queue<Integer> mag = new LinkedList<Integer>();
            int p = k+1, count=0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i) == 'I'){
                    iron.add(i);
                }
                if(s.charAt(i) == 'M'){
                    mag.add(i);
                }
                if(s.charAt(i) == 'X' || i == n-1){
                    int sheet = 0, l, q, r;
                    while(!iron.isEmpty() && !mag.isEmpty()){
                        sheet=0;
                         l = Math.min(mag.element(), iron.element());
                         r = Math.max(mag.element(), iron.element());
                         for(q=l;q<r;q++){
                             if(s.charAt(q)==':'){
                                 sheet++;
                             }
                         }
                         if((p-Math.abs(l-r)-sheet)>0){
                             count++;
                             mag.poll();
                             iron.poll();
                         }
                         else if(mag.element()<iron.element()){
                             mag.poll();
                         }
                         else{
                             iron.poll();
                         }
                    }
                    while(!mag.isEmpty()){
                        mag.poll();
                    }
                    while(!iron.isEmpty()){
                        iron.poll();
                    }
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }
}
/* September Long Challenge 2020*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Covid19B{
	static private Scanner sc = new Scanner(System.in);
	static public void main(String[] args){
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] a = takeInput(n);
			Set<Integer> set = solve_P(a,n);
			printAnwer(set);
		}
	}
	static private int[] takeInput(int n){
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = sc.nextInt();
		}
		return a;
	}
	static private Set<Integer> solve_P(int[] a, int n){
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i = 0;i<n;i++){
			list.add(i);
			for(int j = i+1;j<n;j++){
				if(a[i]>a[j]){
					if(!list.contains(j)){
						list.add(j);
					}
					int t = a[j];
					for(int k = 0;k<i;k++){
						if(t<a[k] && a[i]>=a[k]){
							if(!list.contains(k)){
								list.add(k);
							}
						}
					}
				}
			}
			for(int j = i-1;j>=0;j--){
				if(a[i] <a[j]){
					if(!list.contains(j)){
						list.add(j);
					}
				 	int f = a[j];
					for(int x = i+1;x<n;x++){
						if(f>a[x]  && a[i]<=a[x]){
							if(!list.contains(x)){
								list.add(x);
							}
						}
					}
				}
			}
			set.add(list.size());
			list.clear();
		}
		return set;
	}
	static private void printAnwer(Set<Integer> set){
		List<Integer> list = new ArrayList<>(set);
		if(list.size() == 1){
			System.out.println(list.get(0)+" "+list.get(0));
		} 
		else{
			int minn = Collections.min(list);
			int maxx = Collections.max(list);
			System.out.println(minn+" "+maxx);
		}
	}
}

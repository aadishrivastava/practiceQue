package dev.lpa;

import java.util.*;

public class Main239 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            Set<Integer> set=new TreeSet<>();
            for(int i=0; i<m; i++){
                set.add(sc.nextInt());
            }
            int j=1;
            for(int i=0; i<n; i++) {
                if(s.charAt(i)=='B') {
                    boolean res=true;
                    int r=0;
                    while(res) {
                        j++;
                        if(!set.contains(j)) {
                            if(r==0) set.add(j);
                            r++;
                        }
                        if(r==2){
                            break;
                        }
                    }
                }
                else {
                    j++;
                    set.add(j);
                }
            }
            System.out.println(set.size());
            for(int i: set){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}

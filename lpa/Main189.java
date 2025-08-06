package dev.lpa;
import java.util.*;
public class Main189 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int stash=0;
            int given=0;
            for(int i=0;i<n;i++){
                int gold=sc.nextInt();
                if(gold>=k){
                    stash+=gold;
                }
                if(gold==0 && stash>0){
                    stash--;
                    given++;
                }
            }
            System.out.println(given);
        }
    }
}

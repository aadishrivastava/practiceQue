package dev.lpa;
import java.util.*;
public class Main398 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            AadiSolves(n, s);
        }
    }
    public static void AadiSolves(int n, String s){
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L'){
                break;
            }
            count++;
        }
        System.out.println(count+1);
    }
}

package dev.lpa;
import java.util.*;
public class Main145 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%4==0){
                System.out.println(n/4);
            }else{
                System.out.println((n/4)+1);
            }
        }
    }
}

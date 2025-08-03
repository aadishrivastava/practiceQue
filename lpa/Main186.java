package dev.lpa;
import java.util.*;
public class Main186 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int time1,time2;
            time1=Math.abs(a-1);
            time2=Math.abs(b-c)+Math.abs(c-1);
            if(time1>time2){
                System.out.println(2);
            }else if (time2>time1){
                System.out.println(1);
            }else{
                System.out.println(3);
            }
        }
    }
}

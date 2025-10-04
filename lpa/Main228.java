package dev.lpa;
import java.util.*;
public class Main228 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            if(y>x){
                System.out.println(2);
            }else{
                if(x-1>y && y>1){
                    System.out.println(3);
                }else {
                    System.out.println(-1);
                }
            }


        }
    }
}

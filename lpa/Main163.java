package dev.lpa;
import java.util.*;
public class Main163 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int max=0;
            int count=-1;
            for (int i = 1; i <= n; i++) {
                int x=sc.nextInt();
                int y=sc.nextInt();

                if(x<=10 && y>max){
                    max=y;
                    count=i;
                }
            }
            System.out.println(count);
        }
    }
}

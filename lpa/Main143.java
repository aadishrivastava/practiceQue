package dev.lpa;
import java.util.*;
public class Main143 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),n=sc.nextInt();
            int max=Math.max(a,Math.max(b,c));
            int sub=(max-a)+(max-b)+(max-c);
            if(n<sub) {
                System.out.println("NO");
            }else{
                if((n-sub)%3==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}

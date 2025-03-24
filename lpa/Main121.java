package dev.lpa;
import java.util.*;
public class Main121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();

        while(t-->0){
            int n=sc.nextInt();
            int m=n/3+1;
            if(n%3==0){
                System.out.println(n/3+" "+n/3);
            }else if(n%3==1){
                System.out.println(m+" "+n/3);
            }else if(n%3==2){
                System.out.println(n/3+" "+m);
            }
        }
    }
}

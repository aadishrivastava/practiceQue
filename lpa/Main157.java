package dev.lpa;
import java.util.*;
public class Main157 {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int a=sc.nextInt();
                int b=sc.nextInt();
                int price1=n*a;
                int price2 = (n / 2) * b + (n % 2) * a;

                System.out.println(Math.min(price1,price2));
            }
    }
}
//                if(n%2==0){
//                    price2=(n/2)*b;
//                }else{
//                    price2=((n/2)*b)+a;
//                }
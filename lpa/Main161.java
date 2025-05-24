package dev.lpa;
import java.util.*;
public class Main161 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=a+b+c;
            if(sum%2==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}

//            for(int i=0;i<3;i++){
//                sum+=sc.nextInt();
//            }
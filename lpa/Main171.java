package dev.lpa;
import java.util.*;
public class Main171 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);

    }

}

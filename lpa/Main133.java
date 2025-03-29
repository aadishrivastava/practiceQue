package dev.lpa;
import java.util.*;
public class Main133 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=n/2;
        System.out.println(k);
        if (n%2==0){
            for(int i=1;i<=k;i++){
                System.out.print(2+" ");
            }
        }else{
            for(int i=1;i<=k-1;i++){
                System.out.print(2+" ");
            }
            System.out.print(3);
        }
    }
}

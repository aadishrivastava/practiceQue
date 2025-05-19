package dev.lpa;
import java.util.*;
public class Main156 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int count=0;
            for(int i=0;i<2*n;i++){
                int a=sc.nextInt();
                if(a%2==0){
                    count++;
                }
            }
            System.out.println(count==n?"Yes":"No");
        }
    }
}

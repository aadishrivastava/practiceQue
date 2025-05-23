package dev.lpa;
import java.util.*;
public class Main160 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;

            for(int i = 1; i <= 9; i++){
                int num = i;
                while(num <= n){
                    count++;
                    num = num * 10 + i;
                }
            }
            System.out.println(count);
        }
    }
}

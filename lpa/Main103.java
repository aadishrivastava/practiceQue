package dev.lpa;
import java.util.Scanner;
public class Main103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int n=sc.nextInt();
            int i = n - (n - y) % x;
            System.out.println(i);
        }
    }
}

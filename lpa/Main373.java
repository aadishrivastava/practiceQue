package dev.lpa;
import java.util.*;
public class Main373 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            AadiSolves(x,y,z);
        }
    }
    public static void AadiSolves(int x, int y, int z){
        int max = Math.max(x, Math.max(y, z));
        int count = 0;

        if (x == max) count++;
        if (y == max) count++;
        if (z == max) count++;

        if (count < 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");

            int a = Math.min(x, y);
            int b = Math.min(x, z);
            int c = Math.min(y, z);

            System.out.println(a + " " + b + " " + c);
        }
    }
}

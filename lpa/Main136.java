package dev.lpa;
import java.util.*;
public class Main136 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char pixel = sc.next().charAt(0);
                if (pixel == 'C' || pixel == 'M' || pixel == 'Y') {
                    System.out.println("#Color");
                    return;
                }
            }
        }
        System.out.println("#Black&White");

    }
}

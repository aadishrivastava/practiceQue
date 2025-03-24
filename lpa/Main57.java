package dev.lpa;

import java.util.Scanner;

public class Main57 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s= sc.nextLine();
            if (s.equalsIgnoreCase("yes")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

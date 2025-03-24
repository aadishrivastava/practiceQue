package dev.lpa;

import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int result=0;
        for (int i = k; i >0; i--) {

            if(k!=0 && n%10==0){
                n=n/10;
                k=k-1;
            }else {
                n = n - 1;
                k = k - 1;
            }
        }
        System.out.println(n);

    }


}

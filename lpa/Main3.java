package dev.lpa;
import java.util.Scanner;

public class Main3 {
    public static void main(String... args) {
//        long  a=0;
//        long  b=0;
        Scanner scanner=new Scanner(System.in);
//        long n=scanner.nextLong();
//        for(long i=1;i<=n;i++) {
//
//            double m = Math.pow(-1, i) ;
//       long c=(long)m;
//        b= (long) (c*i);
//        a = a+b;
//
//        }
//
//
//System.out.println(a);


        long x =scanner.nextLong();
        long sum =0;
        if(x%2==1)
        {
            long n = (x+1)/2;
            long m = (x-1)/2;
            sum = m*m +m -n*n;
        }
        else
        {
            long m = x/2;
            long n = x/2;
            sum = m;
        }
        System.out.println(sum);
    }
}
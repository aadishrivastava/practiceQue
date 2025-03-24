package dev.lpa;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

//        int[] p=new int[n*2];
////        int[] q=new int[n];
////        for(int i=1;i<=n;i++){
////            p[i-1]=sc.nextInt();
////            q[i-1]=sc.nextInt();
////            if(p[i-1]-q[i-1]>=2){
////                cnt++;
////            }
////        }
////        System.out.println(cnt);
//        for(int i=0;i<n*2;i++){
//            p[i]= sc.nextInt();
//        }
//        for(int i=1;i<n*2;i++){
//            if(p[i]-p[i-1]>=2){
//                cnt++;
//        double m = Math.pow(-1, i) ;
//        long c=(long)m;
//        b= (long) (c*i);
//        a = a+b;
////            }
//        }
//        System.out.println(cnt);
//    }
        int[][] p = new int[n][2];
        for (int i = 0; i < n; i++) {

                p[i][0]= sc.nextInt();
            p[i][1]= sc.nextInt();

        }
        for (int i = 0; i < n; i++){
            if((p[i][1]-p[i][0])>=2){
            cnt++;
        }
        }
        System.out.println(cnt);

    }
}
//
//
///*
// * Code Author: Roshan Shah
// * DA-IICT
// */
//import java.io.*;
//
//        import java.awt.datatransfer.StringSelection;
//import java.io.*;
//        import java.math.*;
//        import java.text.*;
//        import java.util.*;
//
//
//
//public class first {
//
//    static double eps=(double)1e-6;
//    static long mod=(int)1e9+7;
//    public static void main(String args[]){
//        InputReader sc = new InputReader(System.in);
//        OutputStream outputStream = System.out;
//        PrintWriter out = new PrintWriter(outputStream);
//        //----------My Code----------
//        long x =sc.nextLong();
//        long sum =0;
//        if(x%2==1)
//        {
//            long n = (x+1)/2;
//            long m = (x-1)/2;
//            sum = m*m +m -n*n;
//        }
//        else
//        {
//            long m = x/2;
//            long n = x/2;
//            sum = m;
//        }
//        out.println(sum);
//        //---------------The End------------------
//        out.close();
//    }
//
//    static class Pair implements Comparable<Pair> {
//        long money;
//        long value;
//        //long w;
//        public Pair(long u, long v) {
//            this.money = u;
//            this.value = v;
//        }
//
//        public int hashCode() {
//            int hu = (int) (money ^ (money >>> 32));
//            int hv = (int) (value ^ (value >>> 32));
//            return 31 * hu + hv;
//        }
//
//        public boolean equals(Object o) {
//            if (o instanceof Pair) {
//                Pair p = (Pair) o;
//                return p.money == money && p.value == value;
//            }
//            return false;
//        }
//
//        public int compareTo(Pair other) {
//            return Long.compare(money, other.money) != 0 ? Long.compare(money, other.money) : Long.compare(value, other.value);
//        }
//
//        public String toString() {
//            return "[u=" + money + ", v=" + value + "]";
//        }
//    }
//
//
//
//    public static void debug(Object... o) {
//        System.out.println(Arrays.deepToString(o));
//    }
//
//
//
//    static long pow(long a,long b,long c) {
//        long x=1;
//        long y=a;
//        while(b > 0){
//            if(b%2 == 1){
//                x=(x*y)%c;
//            }
//            y = (y*y)%c; // squaring the base
//            b /= 2;
//        }
//        return  x%c;
//    }
//
//
//
//    static long pow(long n,long p)
//    {
//        long  result = 1;
//        if(p==0)
//            return 1;
//        if (p==1)
//            return n;
//        while(p!=0)
//        {
//            if(p%2==1)
//                result *= n;
//            p >>=1;
//            n*=n;
//        }
//        return result;
//    }
//
//
//
//
//    static long gcd(long x, long y)
//    {
//        if(x==0)
//            return y;
//        if(y==0)
//            return x;
//        long r=0, a, b;
//        a = (x > y) ? x : y; // a is greater number
//        b = (x < y) ? x : y; // b is smaller number
//        r = b;
//        while(a % b != 0)
//        {
//            r = a % b;
//            a = b;
//            b = r;
//        }
//        return r;
//    }
//
//
//
//
//    static class InputReader {
//        public BufferedReader reader;
//        public StringTokenizer tokenizer;
//
//        public InputReader(InputStream inputstream) {
//            reader = new BufferedReader(new InputStreamReader(inputstream));
//            tokenizer = null;
//        }
//
//        public String nextLine(){
//            String fullLine=null;
//            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
//                try {
//                    fullLine=reader.readLine();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//                return fullLine;
//            }
//            return fullLine;
//        }
//        public String next() {
//            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
//                try {
//                    tokenizer = new StringTokenizer(reader.readLine());
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            return tokenizer.nextToken();
//        }
//        public long nextLong() {
//            return Long.parseLong(next());
//        }
//        public int nextInt() {
//            return Integer.parseInt(next());
//        }
//        public double nextDouble() {
//            return Double.parseDouble(next());
//        }
//    }
//
//}

package dev.lpa;
import java.util.*;
public class Main176 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int x3=sc.nextInt();
            int point=-1;
            if ((x1 >= x2 && x1 <= x3) || (x1 >= x3 && x1 <= x2)) {
                point = x1;
            } else if ((x2 >= x1 && x2 <= x3) || (x2 >= x3 && x2 <= x1)) {
                point = x2;
            } else {
                point = x3;
            }
            System.out.println(Math.abs(x1-point)+Math.abs(x2-point)+Math.abs(x3-point));
        }
    }
}

/*
    another way
    take the inputs as array and then sort them
    then find arr[1] as its median
    no need for if-else block
    only change in time complexity O(nlogn)

 */
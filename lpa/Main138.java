package dev.lpa;
import java.util.*;
public class Main138 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int floor=1;
            n=n-2;
            while(n>0){
                floor++;
                n=n-x;
            }
            System.out.println(floor);
        }
    }
}

/*use this instead of a loop
int floor = 1;
if(n > 2){
    floor += (n - 2 + x - 1) / x; // ceil((n - 2)/x)
}

 */
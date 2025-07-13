package dev.lpa;
import java.util.*;
public class Main168 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int mihai=0,bianca=0;
            for(int i=0;i<n;i++){
                int candy=sc.nextInt();
                if(candy%2==0){
                    mihai+=candy;
                }else{
                    bianca+=candy;
                }
            }
            System.out.println(mihai>bianca?"YES":"NO");
        }
    }
}

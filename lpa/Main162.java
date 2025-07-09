package dev.lpa;
import java.util.*;

public class Main162 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            double n = sc.nextDouble();
            int count = 0;
            double x=0;
            for(int d = 1; d <= 9; ){
                x=d+x*10;
                if(x>n){
                    d++;
                    x=0;
                }else{
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}


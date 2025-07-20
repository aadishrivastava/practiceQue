package dev.lpa;
import java.util.*;
public class Main172 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            String s=sc.next();
            StringBuilder result=new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                if (ch == 'p') {
                    result.append('q');
                } else if (ch == 'q') {
                    result.append('p');
                } else {
                    result.append(ch);
                }
            }
            System.out.println(result);


        }
    }
}

package dev.lpa;
import java.util.*;
public class Main141 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String row1=sc.nextLine();
            String row2= sc.nextLine();

            String trans1=transform(row1);
            String trans2=transform(row2);

            System.out.println(trans1.equals(trans2)?"YES":"NO");



        }
    }
    public static String transform(String row){
        StringBuilder sb = new StringBuilder();
        for (char c : row.toCharArray()) {
            if (c == 'R') {
                sb.append('R');
            } else {
                sb.append('X');
            }
        }
        return sb.toString();
    }
}

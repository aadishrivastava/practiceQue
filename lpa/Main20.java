package dev.lpa;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();
        char[] chars = ("" + n).toCharArray();
        char[] chars1 = ("" + m).toCharArray();
        char[] ans = new char[chars.length];


        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars1[i]) {
                ans[i] = '0';
            } else {
                ans[i] = '1';
            }
        }
        System.out.println(new String(ans));
    }
}



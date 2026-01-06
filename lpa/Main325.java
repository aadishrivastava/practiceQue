package dev.lpa;

import java.util.Scanner;

public class Main325 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String s=sc.next();
            String t=sc.next();
            System.out.println(Aadisolves(s,t));
        }
    }
    public static String Aadisolves(String s,String t){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i<s.length(); i++) {
            freq1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i<t.length(); i++) {
            freq2[t.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        boolean possible = true;
        for (int i = 0 ; i<freq1.length; i++) {
            if (freq1[i] > freq2[i]) {
                possible = false;
                break;
            }
            freq2[i] -= freq1[i];
        }
        if (!possible) {
            return "Impossible";

        }

        for (int i = 0 ; i < s.length() ; i++) {
            for (int sm = 0; sm < s.charAt(i) - 'a'; sm++) {
                char cr = (char) (sm + 'a');
                while (freq2[sm] > 0) {
                    sb.append(cr);
                    freq2[sm] -= 1;
                }
            }
            sb.append(s.charAt(i));
        }

        // append remaining chars to the last
        for (int sm = 0; sm < 26; sm++) {
            char cr = (char) (sm + 'a');
            while (freq2[sm] > 0) {
                sb.append(cr);
                freq2[sm] -= 1;
            }
        }

        return sb.toString();
    }
}

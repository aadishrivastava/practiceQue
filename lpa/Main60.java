package dev.lpa;

import java.util.Scanner;

public class Main60 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        StringBuilder st=new StringBuilder();
        st.append(s.charAt(0));
        int cnt=1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==st.charAt(st.length()-1)){
                cnt++;
                if(cnt<3){
                    st.append(s.charAt(i));
                }
            }else{
                cnt=1;
                st.append(s.charAt(i));
            }
        }
        System.out.println(String.valueOf(st));

    }
}

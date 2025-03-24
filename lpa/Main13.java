package dev.lpa;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();

        String st=scanner.nextLine();

        int anton=0;
        int danik=0;

        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)=='A'){
                anton++;
            }else {
                danik++;
            }

        }
        if(anton>danik){
            System.out.println("Anton");
        } else if (anton==danik) {
            System.out.println("Friendship");
        } else {
            System.out.println("Danik");
        }
    }
}

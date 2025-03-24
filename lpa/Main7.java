package dev.lpa;
import java.util.*;
public class Main7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n= scanner.nextLine();
        int cnt=0;
        String color= scanner.nextLine();


        for(int i=1;i<color.length();i++){

                if(color.charAt(i-1)==color.charAt(i)){
                    cnt++;
                }

        }
        System.out.println(cnt);
    }
}

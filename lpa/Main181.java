package dev.lpa;
import java.util.*;
public class Main181 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int hour=Integer.parseInt(s.substring(0,2));
            if(hour>12){
                hour=hour-12;
                if(hour<10){
                    System.out.println("0"+hour+s.substring(2,5)+" PM");
                    continue;
                }
                System.out.println(hour+s.substring(2,5)+" PM");
            }else if(hour==0){
                hour+=12;
                System.out.println(hour+s.substring(2,5)+" AM");
            } else if (hour==12) {
                System.out.println(hour+s.substring(2,5)+" PM");
            } else{
                if(hour<10){
                    System.out.println("0"+hour+s.substring(2,5)+" AM");
                    continue;
                }
                System.out.println(hour+s.substring(2,5)+" AM");
            }

        }
    }
}


/*   another way cleaner , same approach
            int hour = Integer.parseInt(s.substring(0, 2));
            String minutes = s.substring(2, 5);
            String period;

            if (hour == 0) {
                hour = 12;
                period = "AM";
            } else if (hour == 12) {
                period = "PM";
            } else if (hour > 12) {
                hour -= 12;
                period = "PM";
            } else {
                period = "AM";
            }

            String hourStr = String.format("%02d", hour);
            System.out.println(hourStr + minutes + " " + period);

 */
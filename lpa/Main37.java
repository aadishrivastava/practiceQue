package dev.lpa;
import  java.util.*;
public class Main37 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int num=sc.nextInt();
            List<Integer> component=new ArrayList<>();
            int place=1;

            while(num>0){
                int digit=num%10;
                if(digit!=0){
                    component.add(digit*place);
                }
                num/=10;
                place*=10;
            }
            System.out.println(component.size());

            for (int j = component.size()-1; j >=0; j--) {
                System.out.print(component.get(j));
                if(j!=0){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}




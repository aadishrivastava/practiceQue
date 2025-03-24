package dev.lpa;
import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String sc=scanner.nextLine();

        String[] num=sc.split("\\+");
        int[] numbers= new int[num.length];

        for(int i=0;i<num.length;i++){
            numbers[i]=Integer.parseInt(num[i]);
        }
        Arrays.sort(numbers);

        StringBuilder output=new StringBuilder();
        for(int i=0;i<numbers.length;i++){
            output.append(numbers[i]);
            if(i<numbers.length-1){
                output.append("+");
            }
        }
        System.out.println(output.toString());
    }
}


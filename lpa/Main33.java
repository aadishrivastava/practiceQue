package dev.lpa;

import java.util.Scanner;
import java.util.Stack;

public class Main33 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();

        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr= s.charAt(i);
            if(stack.isEmpty()){
                stack.push(curr);
                continue;
            }
            if(curr=='B' && stack.peek()=='A'){
                stack.pop();
            } else if (curr=='D' && stack.peek()=='C') {
                stack.pop();
            }else{
                stack.push(curr);
            }
        }
        System.out.println(stack.size());

    }
}

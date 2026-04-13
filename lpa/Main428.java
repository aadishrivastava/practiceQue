package dev.lpa;

import java.util.Scanner;

public class Main428 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        Student2[] s=new Student2[n];
        for (int i = 0; i < n; i++) {
            int id= scanner.nextInt();
            String name= scanner.next();
            int[] marks=new int[3];
            for (int j = 0; j < 3; j++) {
                marks[j]= scanner.nextInt();
            }
            s[i]=new Student2(id,name,marks);
        }
        int threshold= scanner.nextInt();
        boolean printed=false;
        for (int i = 0; i < n; i++) {
            if (s[i].getAverage()>=threshold){
                System.out.println(s[i].getName());
                printed=true;
            }
        }
        if (!printed){
            System.out.println("No student found");
        }
    }
}
class Student2 {
    private int id;
    private String name;
    private int[] marks;

    public Student2(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks =new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = marks[i];
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }
    public double getAverage(){
        return (double) (marks[0] + marks[1] + marks[2]) /3;
    }
}

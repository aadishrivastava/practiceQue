package dev.lpa;
import java.util.*;
public class Main425 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student[] s=new Student[n];
        for (int i = 0; i < n; i++) {
            int id=sc.nextInt();
            String name=sc.next();
            int marks=sc.nextInt();
            s[i]=new Student(id,name,marks);
        }
        String[] result=getGrade(s);
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].getName()+" "+result[i]);
        }

    }
    public static String[] getGrade(Student[] s){
        String[] str=new String[s.length];
        for (int i = 0; i < s.length; i++) {
            if(s[i].getMarks()>=75){
                str[i]="Distinction";
            } else if (s[i].getMarks()>=60) {
                str[i]="First Class";
            }else if (s[i].getMarks()>=50){
                str[i]= "Second Class";
            }else {
                str[i]="Fail";
            }
        }
        return str;
    }
}
class Student{
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }


}

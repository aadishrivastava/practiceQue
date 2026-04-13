package dev.lpa;
import java.util.*;
public class Main432 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student[] student=new Student[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            String name=sc.next();
            int m=sc.nextInt();
            HashMap<String,Integer> map=new HashMap<>();
            for (int j = 0; j < m; j++) {
                String sub=sc.next();
                int marks=sc.nextInt();
                map.put(sub,marks);
            }
            student[i]=new Student(id,name,map);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(student[i].getName()+" "+student[i].getTopSubject());
        }
    }
}
class Student{
    private int id;
    private String name;
    private HashMap<String,Integer> marks;

    public Student(int id, String name, HashMap<String, Integer> marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public HashMap<String, Integer> getMarks() {
        return marks;
    }
    public String getTopSubject(){
        String sub="";
        int maxMarks=Integer.MIN_VALUE;
        for(String i:marks.keySet()){
            if(marks.get(i)>maxMarks){
                maxMarks=marks.get(i);
                sub=i;
            } else if (marks.get(i)==maxMarks) {
                if(i.compareTo(sub)<0){
                    sub= i;
                }
            }
        }
        return sub;
    }
}

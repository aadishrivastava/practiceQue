package dev.lpa;
import java.util.Scanner;

public class Main430 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Employee[] employee=new Employee[n];
        for (int i = 0; i < n; i++) {
            int id=sc.nextInt();
            String name=sc.next();
            String dept=sc.next();
            double salary= sc.nextDouble();
            employee[i]=new Employee(id,name,dept,salary);
        }
        sc.nextLine();
        String department=sc.nextLine();
        double maxSalary=Integer.MIN_VALUE;
        String name="";
        for (int i = 0; i < n; i++) {
            if (employee[i].getDepartment().equalsIgnoreCase(department)){
                if(employee[i].getSalary()>maxSalary){
                    maxSalary=employee[i].getSalary();
                    name=employee[i].getName();
                }

            }
        }
        System.out.println(maxSalary==Integer.MIN_VALUE?"No employee found":name+" "+(int)maxSalary);
    }
}
class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;


    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

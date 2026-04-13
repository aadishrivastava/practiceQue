package dev.lpa;
import java.util.*;
public class Main413 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee2[] employee2 =new Employee2[4];
        for (int i = 0; i < 4; i++) {
            int id=sc.nextInt();
            sc.nextLine();
            String name= sc.nextLine();
            double salary=sc.nextDouble();
            sc.nextLine();
            String des=sc.nextLine();
            String skill=sc.nextLine();
            employee2[i]=new Employee2(id,name,salary,des,skill);
        }
        String designation=sc.nextLine();
        String skill=sc.nextLine();

        double ans=findAvgSalaryByDesignation(employee2,designation);
        System.out.println(ans>0?ans:"No employees found");
        Employee2[] e2=searchEmployeeBySkill(employee2,skill);
        if (e2.length==0){
            System.out.println("No employees with given skill");
        }else{
            for (Employee2 value : e2) {
                System.out.println(value.getEmpId());
            }
        }


    }

    public static double findAvgSalaryByDesignation(Employee2[] emp, String designation){
        int count=0;
        double sum=0;
        for (Employee2 employee2 : emp) {
            if (employee2.getDesignation().equalsIgnoreCase(designation)) {
                count++;
                sum += employee2.getSalary();
            }
        }
        return count==0?0:sum/count;
    }
    public static Employee2[] searchEmployeeBySkill(Employee2[] emp, String skill){
        List<Employee2> list=new ArrayList<>();
        for (int i = 0; i < emp.length; i++) {
            if(emp[i].getSkill().equalsIgnoreCase(skill)){
                list.add(emp[i]);
            }
        }
        list.sort((a,b)->Double.compare(a.getSalary(),b.getSalary()));
        return list.toArray(new Employee2[0]);
    }
}


class Employee2 {
    private int empId;
    private String empName;
    private double salary;
    private String designation;
    private String skill;

    public Employee2(int empId, String empName, double salary, String designation, String skill) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.designation = designation;
        this.skill = skill;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

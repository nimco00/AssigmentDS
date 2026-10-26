package Asigments;

import Assigmens.Student;

//super class
public class Employee {
    //create variable
    String employeeId;
    String Name;
    String Category;
    double basicsalary;
    //constructor
    Employee( String employeeId, String Name, String Category,double basicsalary){
        this.employeeId=employeeId;
        this.Name=Name;
        this.Category=Category;
        this.basicsalary=basicsalary;
    }
    //calculate method
    void CalculateSalary(double Salary){
        Salary=basicsalary+Salary;
        System.out.println("month salary :$" +Salary);
    }
    void display(){
        System.out.println("Employee ID :"+employeeId);
        System.out.println("Name :"+Name);
        System.out.println("Category :"+Category);
    }
}
class FullTimeEmployee extends Employee{
    double allowance;
    FullTimeEmployee(String employeeId,String Name,String Category,double basicsalary,double allowance){
        this.allowance=allowance;
                super(employeeId,Name,Category,basicsalary);
    }

    void CalculateSalary(){
        double salary= basicsalary + allowance;
        System.out.println("month salary"+salary);
    }

    @Override
    void display() {
        super.display();
        CalculateSalary(basicsalary);
    }
}
class PartTime extends Employee{
    int hourwork;
    double hourRate;

    PartTime(String employeeId ,String Name ,String Category,double basicsalary,int hourwork,double hourRate){
        super(employeeId,Name,Category,basicsalary);
        this.hourwork=hourwork;
        this.hourRate=hourRate;
    }
    @Override
    void display() {
        super.display();

        CalculateSalary(basicsalary);
    }
}
class Manger extends Employee{
    double bonus;

    Manger(String employeeId ,String Name ,String Category,double basicsalary,double bonus){
        super(employeeId,Name,Category,basicsalary);
        this.bonus=bonus;
    }

    @Override
    void display() {
        super.display();
       CalculateSalary(basicsalary);
    }
}
 class main{
     static void main(){
        Employee[] Employee={
                new FullTimeEmployee("Emp 002","Ahmed","Full-time Employee",39,8),
                new PartTime("EMP008","Hassan","part-time Employee",200,24,12),
                new Manger("Emp009","Aisha","Manager",400,500)
        };
         System.out.println("===== EMPLOYEE SALARY REPORT =====");
         for (Employee e:Employee){
             e.display();
             System.out.println();
         }

    }
}
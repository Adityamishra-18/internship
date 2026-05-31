package com.Driver;

import com.Dao.employeedbutil;
import com.Entity.employee;

import java.util.Scanner;

public class employeedriver {
    private static int choice=0;
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        employeedbutil dbutil=new employeedbutil();
        employeedbutil.connectToDb();
        do {
            System.out.println("1.Add Employee\n2.View Employee\n3.Search Employee\n4.Update Employee\n5.Delete Employee");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    employee emp=new employee();
                    System.out.println("Enter Id");
                    emp.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter Name");
                    emp.setName(sc.nextLine());
                    System.out.println("Enter Department");
                    emp.setDepartment(sc.nextLine());
                    System.out.println("Enter Salary");
                    emp.setSalary(sc.nextDouble());
                    int rws=dbutil.insert(emp);
                    if(rws>0){
                        System.out.println(emp.getName()+" Employee Added Successfully");
                    }else{
                        System.out.println("Issue In Adding Employee");
                    }
                    break;
                case 2:
                    dbutil.displayAll();
                    break;
                case 3:
                    System.out.println("Enter Employee Id");
                    dbutil.getById(sc.nextInt());
                    break;
                case 4:
                    employee e=new employee();
                    System.out.println("Enter Employee Id");
                    e.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter New Name");
                    e.setName(sc.nextLine());
                    System.out.println("Enter New Department");
                    e.setDepartment(sc.nextLine());
                    System.out.println("Enter New Salary");
                    e.setSalary(sc.nextDouble());
                    if(dbutil.update(e)>0){
                        System.out.println("Employee Updated Successfully");
                    }else{
                        System.out.println("Issue In Updating Employee");
                    }
                    break;
                case 5:
                    System.out.println("Enter Employee Id");
                    if(dbutil.deleteById(sc.nextInt())){
                        System.out.println("Employee Deleted Successfully");
                    }else{
                        System.out.println("Issue In Deleting Employee");
                    }
                    break;
                default:

                    System.out.println("Enter Valid Choice");
            }

        }while(choice!=0);
    }
}

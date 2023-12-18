import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Makarand", "Patil", 78, 23, 180, 8, 3, 55000.0);


        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.firstName + " " + employee.lastName);
        System.out.println("Registration Number: " + employee.regno);
        System.out.println("Age: " + employee.age);
        System.out.println("Days Worked: " + employee.daysWorked);
        System.out.println("Vacation Days Taken: " + employee.vacationDaysTaken);
        System.out.println("Years Worked: " + employee.yearsWorked);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Time to Retirement: " + employee.timeToRetirement() + " years");
        System.out.println("Vacation Time Left: " + employee.vacationTimeLeft() + " days");
        System.out.println("Bonus: " + employee.calculateBonus());


        SalesRep salesRep = new SalesRep("Pratik", "Kapse", 123, 30, 200, 10, 5, 50000.0, 100000.0);


        System.out.println("\nSales Rep Information:");
        System.out.println("Name: " + salesRep.firstName + " " + salesRep.lastName);
        System.out.println("Registration Number: " + salesRep.regno);
        System.out.println("Age: " + salesRep.age);
        System.out.println("Days Worked: " + salesRep.daysWorked);
        System.out.println("Vacation Days Taken: " + salesRep.vacationDaysTaken);
        System.out.println("Years Worked: " + salesRep.yearsWorked);
        System.out.println("Salary: " + salesRep.salary);
        System.out.println("Sales Made: " + salesRep.salesMade);
        System.out.println("Commission: " + salesRep.calculateCommission());
        System.out.println("Time to Retirement: " + salesRep.timeToRetirement() + " years");
        System.out.println("Vacation Time Left: " + salesRep.vacationTimeLeft() + " days");


        SalesManager salesManager = new SalesManager("Pranali", "Rawal", 456, 35, 250, 15, 8, 60000.0, 200000.0);


        salesManager.salesTeam.put(1, salesRep);


        System.out.println("\nSales Manager Information:");
        System.out.println("Name: " + salesManager.firstName + " " + salesManager.lastName);
        System.out.println("Registration Number: " + salesManager.regno);
        System.out.println("Age: " + salesManager.age);
        System.out.println("Days Worked: " + salesManager.daysWorked);
        System.out.println("Vacation Days Taken: " + salesManager.vacationDaysTaken);
        System.out.println("Years Worked: " + salesManager.yearsWorked);
        System.out.println("Salary: " + salesManager.salary);
        System.out.println("Commission: " + salesManager.calculateCommission());


    }
}



import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {
            System.out.println("1. Add employee ");
            System.out.println("2. View employee by entering registration number");
            System.out.println("3. View All employee list");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Enter first name:");
                    String firstName = sc.next();
                    System.out.println("Enter last name:");
                    String lastName = sc.next();
                    System.out.println("Enter registration number:");
                    int registrationNumber = sc.nextInt();
                    System.out.println("Enter age:");
                    int age = sc.nextInt();
                    System.out.println("Enter days worked:");
                    int daysWorked = sc.nextInt();
                    System.out.println("Enter vacation days taken:");
                    int vacationDaysTaken = sc.nextInt();
                    System.out.println("Enter years worked:");
                    int yearsWorked = sc.nextInt();
                    System.out.println("Enter salary:");
                    double salary = sc.nextDouble();

                    Employee newEmployee = new Employee(firstName, lastName, registrationNumber, age, daysWorked, vacationDaysTaken, yearsWorked, salary);
                    employeeList.add(newEmployee);
                    System.out.println("Employee added successfully.");
                    break;



                case 2:

                    System.out.println("Enter registration number to view employee:");
                    int regNumberToView = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < employeeList.size(); i++) {
                        Employee employee = employeeList.get(i);
                        if (employee.regno == regNumberToView) {
                            // Display employee details
                            System.out.println("Employee Details for Registration Number " + regNumberToView + ":");
                            System.out.println("Name: " + employee.firstName + " " + employee.lastName);
                            System.out.println("Age: " + employee.age);
                            System.out.println("Registration no: "+employee.regno);

                            found = true;
                            break;
                        }
                    }


                    break;


                case 3:
                    System.out.println("All Employees:");

                    for (int i = 0; i < employeeList.size(); i++) {
                        Employee employee = employeeList.get(i);
                        System.out.println("Employee " + i + " Details:");
                        System.out.println("Name: " + employee.firstName + " " + employee.lastName);
                        System.out.println("Age: " + employee.age);

                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

import java.util.*;

public class Employee {
    public String firstName;
    public String lastName;
    public int regno;
    public int age;
    public int daysWorked;
    public int vacationDaysTaken;
    public int yearsWorked;
    public double salary;

    public Employee(String firstName, String lastName, int regno,int age, int daysWorked, int vacationDaysTaken, int yearsWorked, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regno=regno;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.yearsWorked = yearsWorked;
        this.salary = salary;
    }

    public int timeToRetirement() {
        int yearsToRetirement = Math.min(60 - age, 40 - yearsWorked);
        return Math.max(0, yearsToRetirement);
    }

    public int vacationTimeLeft() {
        double vacationTimeLeft = (daysWorked / 360.0) * (30 - vacationDaysTaken);
        return Math.max(0, (int) vacationTimeLeft);
    }

    public double calculateBonus() {
        return 2.2 * salary;
    }
}

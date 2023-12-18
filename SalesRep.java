public class SalesRep extends Employee {

    public double salesMade;

    public SalesRep(String firstName, String lastName, int regno, int age, int daysWorked, int vacationDaysTaken, int yearsWorked, double salary, double salesMade) {
        super(firstName, lastName, regno, age, daysWorked, vacationDaysTaken, yearsWorked, salary);
    }


    public double calculateCommission() {
        return 0.1 * salesMade;
    }
}

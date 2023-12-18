
import java.util.*;
public class SalesManager extends SalesRep {

    public HashMap<Integer, SalesRep> salesTeam;

    public SalesManager(String firstName, String lastName, int regno, int age, int daysWorked, int vacationDaysTaken, int yearsWorked, double salary, double salesMade) {
        super(firstName, lastName, regno, age, daysWorked, vacationDaysTaken, yearsWorked, salary, salesMade);
        this.salesTeam = new HashMap<>();
    }


}


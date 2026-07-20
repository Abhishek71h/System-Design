package Design_Pattern.Factory_Design_Pattern;
import java.util.*;

public class Main {
    
    public static void main(String args[]) {
        // Create Factory
        PlanFactory factory = new PlanFactory();

        // Take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of plan for which the bill will be generated: ");
        String planName = sc.nextLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = sc.nextInt();

        // Object Creation --> By factory
        Plan plan = factory.getPlan(planName);

        System.out.println("PlanName is: " + planName);

        System.out.println("Rate is: ");
        plan.getRate();
        System.out.println(plan.rate);

        System.out.println("Total Bill is: ");
        plan.calculateBill(units);
        sc.close();
    }
}

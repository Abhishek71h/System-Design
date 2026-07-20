package LLD.Lesson5_InterfaceSegregationPrinciple.Example2.Problematic_Code;

public class Car implements Vehicle{
    
    @Override
    public void drive() {
        System.out.println("Driving.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Car's can't fly!");
    }
}

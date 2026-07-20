package LLD.Lesson5_InterfaceSegregationPrinciple.Example2.Better_Code;

public class Car2 implements Drivable{
    
    @Override
    public void drive() {
        System.out.println("Driving.");
    }
}

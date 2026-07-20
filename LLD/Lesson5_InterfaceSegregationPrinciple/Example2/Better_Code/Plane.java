package LLD.Lesson5_InterfaceSegregationPrinciple.Example2.Better_Code;

public class Plane implements Drivable, Flyable{
    
    @Override
    public void drive() {
        System.out.println("Driving on the runway.");
    }

    @Override
    public void fly() {
        System.out.println("Flying.");
    }
}
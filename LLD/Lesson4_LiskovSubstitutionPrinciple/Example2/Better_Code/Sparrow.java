package LLD.Lesson4_LiskovSubstitutionPrinciple.Example2.Better_Code;

public class Sparrow implements FlyingBird, Bird2{
    
    @Override
    public void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    public void sound() {
        System.out.println("Chip Chip");
    }
}
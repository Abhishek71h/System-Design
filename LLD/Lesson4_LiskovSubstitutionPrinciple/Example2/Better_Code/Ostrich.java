package LLD.Lesson4_LiskovSubstitutionPrinciple.Example2.Better_Code;

public class Ostrich implements Bird2{
    
    @Override
    public void sound() {
        System.out.println("Ostrich Sound.");
    }
}
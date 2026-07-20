package LLD.Lesson6_Dependency_Inversion_Principle.Example1.Better_Code;

public class Monitor2 implements OutputDevice{
    
    @Override
    public void display(String content) {
        System.out.println(content);
    }
}
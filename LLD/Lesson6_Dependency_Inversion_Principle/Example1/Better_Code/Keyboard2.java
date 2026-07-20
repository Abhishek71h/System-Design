package LLD.Lesson6_Dependency_Inversion_Principle.Example1.Better_Code;

public class Keyboard2 implements InputDevice{
    
    @Override
    public String getInput() {
        return "User Input";
    }
}

package LLD.Lesson6_Dependency_Inversion_Principle.Example1.Problematic_Code;

public class Computer {
    
    private Keyboard keyboard = new Keyboard();
    private Monitor monitor = new Monitor();

    public void start() {
        String input = keyboard.getInput();
        System.out.println("Processing " + input);
    }
}

/*
Problem: Computer is tightly coupled to keyboard and monitor, making it hard to change implementations.
*/
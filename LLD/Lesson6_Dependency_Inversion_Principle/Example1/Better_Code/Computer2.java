package LLD.Lesson6_Dependency_Inversion_Principle.Example1.Better_Code;

public class Computer2 {
    
    private InputDevice inputDevice;
    private OutputDevice outputDevice;

    public Computer2(InputDevice inputDevice, OutputDevice outputDevice) {
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
    }

    public void start() {
        String input = inputDevice.getInput();
        outputDevice.display("Processing " + input);
    }
}

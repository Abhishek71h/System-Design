package LLD.Lesson1_SingleResponsibilityPrinciple.Example6.Better_Code;

public class Employee2 {
    
    private String name;
    private double salary;

    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println("Calculating salary.");
    }
}

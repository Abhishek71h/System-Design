package LLD.Lesson1_SingleResponsibilityPrinciple.Example6.Problematic_Code;

class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void saveToDatabase() {
        System.out.println("Saving employee data to the database.");
    }

    public void calculateSalary() {
        System.out.println("Calculating salary.");
    }
}

/*

    Problem:
    This class has two responsibilities:
        Bussiness logic for employee salary.
        Database operations.

    This is voilated the SingleResponsibilityPrinciple (SRP).
*/
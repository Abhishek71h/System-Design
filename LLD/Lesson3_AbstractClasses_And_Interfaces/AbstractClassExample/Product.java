package LLD.Lesson3_AbstractClasses_And_Interfaces.AbstractClassExample;

public abstract class Product {
    
    // An Abstract Method
    public abstract double calculateDiscount();

    // Concrete Method (Non-Abstract Method)
    public void termsAndCondition() {
        System.out.println("Some Terms");
    }
}

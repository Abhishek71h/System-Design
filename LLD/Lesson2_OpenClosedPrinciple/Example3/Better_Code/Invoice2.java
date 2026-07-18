package LLD.Lesson2_OpenClosedPrinciple.Example3.Better_Code;

public class Invoice2 {
    
    private double amount;

    public Invoice2(double amount) {
        this.amount = amount;
    }

    public void print(InvoicePrinter printer) {
        printer.print(this);
    }
}
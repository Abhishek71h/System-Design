package LLD.Lesson2_OpenClosedPrinciple.Example3.Problematic_Code;

public class Invoice {
    
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void printInvoice(String format) {
        if(format.equals("PDF")) {
            System.out.println("Printing Invoice as PDF.");
        }
        else if(format.equals("Excel")) {
            System.out.println("Printing Invoice as Excel.");
        }
    }
}

/*
    Problem:
    Adding a new format, such as Word, HTML etc requires modifying the printInvoice method.
*/

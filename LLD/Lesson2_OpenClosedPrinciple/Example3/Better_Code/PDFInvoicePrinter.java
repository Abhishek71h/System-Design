package LLD.Lesson2_OpenClosedPrinciple.Example3.Better_Code;

public class PDFInvoicePrinter implements InvoicePrinter{
    
    @Override
    public void print(Invoice2 invoice) {
        System.out.println("Printing invoice as PDF.");
    }
}

package LLD.Lesson2_OpenClosedPrinciple.Example3.Better_Code;

public class Driver {
    public static void main(String[] args) {
        InvoicePrinter PDFInvoicePrinter = new PDFInvoicePrinter();

        Invoice2 invoice2 = new Invoice2(1000);
        invoice2.print(PDFInvoicePrinter);
    }
}

package LLD.Lesson2_OpenClosedPrinciple.Example2.BetterCode;

public class PDFReportGenerator implements ReportGenerator {

    @Override
    public String generate() {
        return "PDF Report..";
    }
}
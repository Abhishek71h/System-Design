package LLD.Lesson1_SingleResponsibilityPrinciple.Example3;


import LLD.Lesson1_SingleResponsibilityPrinciple.Example2.Better_Code.Employee;

public class EmployeePerformanceGenerator {

    public String generatePerformance(String reportType, Employee employee) {
        if(reportType.equals("PDF")) {
            return "Generating PDF report.";
        }
        if(reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported."; 
    }
}

// This class follow Single Responsibility Principle (SRP).
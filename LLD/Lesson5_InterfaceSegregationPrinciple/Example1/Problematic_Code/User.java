package LLD.Lesson5_InterfaceSegregationPrinciple.Example1.Problematic_Code;

public interface User {
    
    boolean canBuyProducts();

    boolean canModifyProducts();

    boolean canAddProducts();

    boolean canApproveProducts();

    void approveProduct();
}
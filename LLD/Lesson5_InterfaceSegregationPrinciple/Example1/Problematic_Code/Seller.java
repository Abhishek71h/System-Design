package LLD.Lesson5_InterfaceSegregationPrinciple.Example1.Problematic_Code;

public class Seller implements User{
    
    @Override
    public boolean canBuyProducts() {
        return true;
    }

    @Override
    public boolean canModifyProducts() {
        return true;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public void approveProduct() {
        
    }
}

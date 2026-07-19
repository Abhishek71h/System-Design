package LLD.Lesson5_InterfaceSegregationPrinciple.Example1.Problematic_Code;

public class Admin implements User{
    
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return true;
    }

    @Override
    public boolean canApproveProducts() {
        return true;
    }

    @Override
    public void approveProduct() {

    }
}

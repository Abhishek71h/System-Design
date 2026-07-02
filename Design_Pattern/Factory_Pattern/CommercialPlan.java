package Design_Pattern.Factory_Pattern;

public class CommercialPlan extends Plan{
    
    @Override
    public void getRate() {
        this.rate = 4;
    }
}
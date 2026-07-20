package Design_Pattern.Factory_Design_Pattern;

public class PlanFactory {
    
    public Plan getPlan(String planName) {
        if(planName == null) {
            return null;
        }
        else if(planName.equalsIgnoreCase("domestic")) {
            return new DomesticPlan();
        }
        else if(planName.equalsIgnoreCase("commercial")) {
            return new CommercialPlan();
        }
        else if(planName.equalsIgnoreCase("institutional")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
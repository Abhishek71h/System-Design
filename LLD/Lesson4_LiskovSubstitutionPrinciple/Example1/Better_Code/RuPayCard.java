package LLD.Lesson4_LiskovSubstitutionPrinciple.Example1.Better_Code;

public class RuPayCard extends CreditCard implements UpiCompatibleCreditCard {
    
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of RuPayCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of RuPayCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of RuPayCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments impl of RuPayCard");
    }

    @Override
    public void upiPayment() {
        System.out.println("UPI Payment impl of RuPayCard");
    }
}

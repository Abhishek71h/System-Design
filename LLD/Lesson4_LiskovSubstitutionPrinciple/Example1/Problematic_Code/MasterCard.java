package LLD.Lesson4_LiskovSubstitutionPrinciple.Example1.Problematic_Code;

public class MasterCard extends CreditCard{
    
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments impl of MasterCard");
    }

    @Override
    public void upiPayment() {
        System.out.println("UPI Payments impl of MasterCard");
    }

    @Override
    public void intlPayment() {
        System.out.println("Intl Pay impl of MasterCard");
    }
}

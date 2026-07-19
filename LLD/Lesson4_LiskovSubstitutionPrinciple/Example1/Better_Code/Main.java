package LLD.Lesson4_LiskovSubstitutionPrinciple.Example1.Better_Code;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for(InternationalPaymentCompatibleCreditCard card: cards) {
            card.internationalPayment();
        }
    }
}
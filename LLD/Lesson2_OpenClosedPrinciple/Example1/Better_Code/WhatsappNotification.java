package LLD.Lesson2_OpenClosedPrinciple.Example1.Better_Code;

public class WhatsappNotification implements Notification {
    
    @Override
    public void send() {
        System.out.println("Sending Whatsapp..");
    }
}
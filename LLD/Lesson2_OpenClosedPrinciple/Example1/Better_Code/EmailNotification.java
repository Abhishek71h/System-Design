package LLD.Lesson2_OpenClosedPrinciple.Example1.Better_Code;

public class EmailNotification implements Notification {
    
    @Override
    public void send() {
        System.out.println("Sending Email..");
    }
}
package LLD.Lesson2_OpenClosedPrinciple.Example1.Better_Code;
import java.util.*;

public class NotificationSender {
    
    public void sendNotifications(List<Notification> notificationTypes) {

        for(Notification notification: notificationTypes) {
            notification.send();
        }
    }
}

package Design_Pattern.Singleton_Design_Pattern;

public class Main {
    
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.sayHello();
    }
}

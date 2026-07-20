package Design_Pattern.Singleton_Design_Pattern;

public class Singleton {
    
    // data member
    static Singleton instance = null;

    // Constructor made to be private because of one instance
    private Singleton() {

    }

    static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hi, I am a Singleton Class");
        System.out.println(instance);
    }
}
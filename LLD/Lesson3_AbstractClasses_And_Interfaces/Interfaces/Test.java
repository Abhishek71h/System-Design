package LLD.Lesson3_AbstractClasses_And_Interfaces.Interfaces;

interface A {
    default void doSome() {
        System.out.println("A");
    }
}

interface B {
    default void doSome() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override
    public void doSome() {
        B.super.doSome(); // Calls B's default method
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.doSome();
    }
}

/*
 * In Java 8, interfaces were enhanced with default methods, which allow
 * interfaces to provide a method implementation using the default keyword. This
 * feature was introduced to maintain backward compatibility, so that new
 * methods could be added to existing interfaces without forcing all
 * implementing classes to update their code. In this example, both interface A
 * and interface B define a default method named doSome(). When class C
 * implements both interfaces, it inherits two methods with the same signature.
 * This creates an ambiguity because Java cannot determine whether it should
 * execute A's implementation or B's implementation when doSome() is called. To
 * avoid unpredictable behavior, Java reports a compile-time error unless the
 * implementing class explicitly overrides the conflicting method.
 * In class C, the doSome() method is overridden to resolve this conflict.
 * Inside the overridden method, the statement B.super.doSome(); is used. The
 * syntax InterfaceName.super.methodName() is a special feature available only
 * for default methods in interfaces, and it allows the class to explicitly
 * invoke the default implementation of a particular interface. Here,
 * B.super.doSome(); tells Java to execute the doSome() method defined in
 * interface B, so the output of the program is B. Similarly, if
 * A.super.doSome(); were used, the output would be A. The class could also
 * provide its own implementation instead of calling either interface's method,
 * or even call both methods if required.
 * 
 * This situation is often referred to as the Diamond Problem in Java. Unlike
 * some other languages, Java does not allow multiple inheritance of classes
 * because it can lead to ambiguity. However, Java does allow a class to
 * implement multiple interfaces. When multiple interfaces provide the same
 * default method, Java resolves the ambiguity by requiring the implementing
 * class to override the method and explicitly choose which implementation to
 * use. This ensures that the program remains clear, predictable, and free from
 * conflicts.
 */
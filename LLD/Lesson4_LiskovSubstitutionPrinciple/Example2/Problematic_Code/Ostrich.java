package LLD.Lesson4_LiskovSubstitutionPrinciple.Example2.Problematic_Code;

public class Ostrich extends Bird{
    
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}

/*
Problem : Using Ostrich as a Bird will break the program when fly() is called.
*/
package ex_04082024OopsConstructor.MultilevelInheritance;

public class Lab046 {
    public static void main(String[] args) {
        //Multi level Inheritance
        //GF -> F-> C
        Child c1 = new Child();
        c1.home(); // If name is same C -> F -> GF
        c1.c();
        c1.f();
        c1.gf();
    }
}



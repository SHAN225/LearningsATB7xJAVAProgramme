package Practise;

public class Lab1010 {
    public static void main(String[] args) {
        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // || - OR Operator

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // BIO
        int a = 12;
        boolean b = !(a > 10 || a < 5); // BODMAS
        System.out.println(b);
        // BODMAS stands for
        // Bracket, Of, Division,
        // Multiplication, Addition, and Subtraction.

    }
}

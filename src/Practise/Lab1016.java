package Practise;

public class Lab1016 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A - a++  -> Exp = 10 | a = 11
        // + - operator
        // B- a++  -> Exp = 12 | a = 12

        int b = 10;
        System.out.println(++b + ++b);
        System.out.println(b);
        // A -> ++a , Exp = 11    |  a = 11
        // + -> nothing
        // B -> ++a  Exp =  12 | a = 12
        // Exp = A+B = 23 , a = 12

        // a--, --a

    }
}

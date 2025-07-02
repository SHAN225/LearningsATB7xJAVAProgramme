package Practise;

public class Lab1015 {
    public static void main(String[] args) {
//        int a = 10;
//        int result = a++;
//        System.out.println(a);
//        System.out.println(result);
//
//        // Exp = 10 , a = 11?


        int a = 10;
        int result = ++a;
        System.out.println(a);
        System.out.println(result);

        // Exp = 11 , a = 11?

        int b = 10;
        System.out.println(b++ +b);
        // A = a++ -> 10 , a = 11
        // +
        // B = a = 11 ->  A+B = 10+11

        int c = 10;
        System.out.println(++c + ++c);
        System.out.println(c);

        int d = 10;
        System.out.println(d++ + ++d + +d);
        System.out.println(d);

    }
}

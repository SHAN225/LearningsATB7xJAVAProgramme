package Practise;

public class Lab1008 {
    public static void main(String[] args) {
        // Relational Operators -> boolean
        //    // >, < >=,<=, == , != ( ! = ) - true or false.
        int age_mamitha = 31;
        int age_pramod = 35;
//        boolean result = age_pramod > age_mamitha;
//        boolean result = age_pramod < age_mamitha;
        boolean result2 = age_pramod >= age_mamitha;// OR gate
        boolean result3 = age_pramod <= age_mamitha;
        boolean result4 = age_pramod < age_mamitha;
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

            // || - OR Operator

            System.out.println(true || true);
            System.out.println(true || false);
            System.out.println(false || true);
            System.out.println(false || false);
    }
}
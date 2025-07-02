package Practise;

public class Lab1017 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12 We not add value for Post Increment i.e. a++
        //  Part ->  C -> a++, Exp3 = 12 , a = 13
        // op ->  exp1+ exp2+exp3
        // a  = 13


        int b = 52;
        long c = 75;
        String S1 = "TT";
        String S2 = "KK";
        System.out.println(S1+S2+b+c);
        System.out.println(S1+S2+(b+c));

    }
}

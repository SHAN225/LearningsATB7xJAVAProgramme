package ex_14072024;

public class Lab012PrePostIncrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

       // A - a++ -> 10 , a = 11
       // + -> Operator
       // B - ++a -> 12 , a = 12
       // A + B = 22 and final a value is 12
    }
}

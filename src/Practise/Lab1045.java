package Practise;

//Concept of While and For Loop

public class Lab1045 {
    public static void main(String[] args) {
        // while, for -?
        // do while - while - 1 change - minor change

        // While -> int -> condition -> body -> increment / decrement

        // Do While
        // int -> body -> condition -> incre / drement

        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 10);

        int i = 10;
//        while (i<10){
//            System.out.println(i);
//            i++;
//        This is not executed because 10 is not less than 10

        do{
            System.out.println(i);
            i++;
        }while(i<10);


    }
}
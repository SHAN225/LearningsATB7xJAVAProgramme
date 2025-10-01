package Practise;

public class Lab1039 {
    public static void main(String[] args) {
        // Loop with condition
        //
        for (int i = 1; i <= 10; i++) {
            // i from 1 to 10, 10 times
            if (i == 5) {
                System.out.println("Five");
            } else {
                System.out.println(i);
            }
        }

        // 1
        //2
        //3
        //4
        //Five
        //6
        //7
        //8
        //9
        //10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

    }
}
package ex_21072024forloopandotherloops;

public class Lab027 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = -0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Five");
            } else {
                System.out.println(i);
            }
        }

        for (int i = 0; i <= 40; i++) {
            if(i%2 ==0) {
                System.out.println(i);
            }
        }
    }
}
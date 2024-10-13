package july.ex_21072024forloopandotherloops;

public class Lab028 {
    public static void main(String[] args) {
         for (int i = 0; i<=50; i++) {
             if (i % 2 == 0 ) { // i = 0 to 51
                 System.out.println("Even -> "+ i);
                 continue;
             }
             System.out.println("odd ->"+ i);
         }

         for (int i = 0; i<=60; i=i+3) {
             if (i % 2 == 0) {
                 System.out.println(i);
             }
         }
    }
}

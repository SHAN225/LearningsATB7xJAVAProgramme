package july.ex_21072024forloopandotherloops;

public class Lab031Greet {
    public static void main(String[] args) {
        //Function
        //Block code which we can use
        //1.Pre Built - Math.max
        //2.User Created/defined
        //Two component of function
        //1. Define and 2.Call of Action

        for (int i = 0; i < 2; i++) {
             greet();
        }
        for (int i = 0; i < 3; i++) {
            greet2();
        }
    }
    static void greet() {
        System.out.println("Hi, How are you!!");
    }

    static void greet2(){
        System.out.println("I am Fine");
    }
}
